package com.kamelyazev.shortlink.service.impl;

import com.kamelyazev.shortlink.service.RedirectService;
import com.kamelyazev.shortlink.service.ShortLinkService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RedirectServiceImpl implements RedirectService {

    private final ShortLinkService shortLinkService;


    @Override
    public String getRedirectLink(String token) {
        return shortLinkService.getLongLinkByToken(token);
    }

}
