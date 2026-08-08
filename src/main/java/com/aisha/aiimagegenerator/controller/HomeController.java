package com.aisha.aiimagegenerator.controller;

import com.aisha.aiimagegenerator.service.ImageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    private final ImageService imageService;

    public HomeController(ImageService imageService) {
        this.imageService = imageService;
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/generate")
    public String generateImage(
            @RequestParam("prompt") String prompt,
            @RequestParam("size") String size,
            @RequestParam("style") String style,
            Model model) {

        String imageUrl =
                imageService.generateImage(prompt, size, style);

        model.addAttribute("imageUrl", imageUrl);
        model.addAttribute("prompt", prompt);

        return "index";
    }
}