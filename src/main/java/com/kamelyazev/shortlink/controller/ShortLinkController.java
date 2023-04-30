package com.kamelyazev.shortlink.controller;

import com.kamelyazev.shortlink.service.ShortLinkService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class ShortLinkController {

    private final ShortLinkService shortLinkService;

    @GetMapping("/SL/")
    public String getShortLink(Model model, @RequestParam String longLink) {
        String token = shortLinkService.createToken(longLink);
        model.addAttribute("longLink", longLink);
        model.addAttribute("tokenLink", "http://localhost:8080/" + token);
        return "index";
    }
}
