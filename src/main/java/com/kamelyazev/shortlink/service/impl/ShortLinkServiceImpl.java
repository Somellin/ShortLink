package com.kamelyazev.shortlink.service.impl;

import com.kamelyazev.shortlink.model.LinkMap;
import com.kamelyazev.shortlink.repository.LinkMapRepository;
import com.kamelyazev.shortlink.service.ShortLinkService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@RequiredArgsConstructor
public class ShortLinkServiceImpl implements ShortLinkService {

    private final LinkMapRepository linkMapRepository;

    @Override
    public String getLongLinkByToken(String token) {
        return linkMapRepository.getLongLinkByToken(token);
    }

    @Override
    public String createToken(String longLink) {
        String findToken = this.findTokenByLongLink(longLink);
        if ( findToken == null ){
            String token = createLinkToken();
            LinkMap linkMap = new LinkMap(longLink,token);
            linkMapRepository.save(linkMap);
            return token;
        }
        return findToken;
    }

    private String findTokenByLongLink(String longLink) {
        return linkMapRepository.findTokenByLongLink(longLink);
    }

    private String createLinkToken () {
        int leftLimit = 48;
        int rightLimit = 122;
        int targetStringLength = 6;
        Random random = new Random();

        return random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

}
