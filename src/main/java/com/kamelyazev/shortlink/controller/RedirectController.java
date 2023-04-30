package com.kamelyazev.shortlink.controller;

import com.kamelyazev.shortlink.service.RedirectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class RedirectController {

    private final RedirectService redirectService;

    @GetMapping("/{token}")
    public String redirectByToken(@PathVariable String token) {
        String redirectLink = redirectService.getRedirectLink(token);
        if (redirectLink == null) {
            return "404";
        }
        return "redirect:" + redirectLink;
    }

}
