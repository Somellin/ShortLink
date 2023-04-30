package com.kamelyazev.shortlink.service;

public interface ShortLinkService {
    String getLongLinkByToken(String token);
    String createToken(String longLink);
}
