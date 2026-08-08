package com.aisha.aiimagegenerator.service;

import org.springframework.stereotype.Service;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@Service
public class ImageService {

    public String generateImage(String prompt, String size, String style) {

        System.out.println("Prompt : " + prompt);
        System.out.println("Size : " + size);
        System.out.println("Style : " + style);

        try {

            String finalPrompt = prompt + ", " + style + " style";

            String encodedPrompt = URLEncoder.encode(
                    finalPrompt,
                    StandardCharsets.UTF_8
            );

            String imageUrl =
                    "https://image.pollinations.ai/prompt/"
                            + encodedPrompt;

            System.out.println("Image URL created successfully.");
            System.out.println(imageUrl);

            return imageUrl;

        } catch (Exception e) {

            System.out.println("Image generation failed.");
            e.printStackTrace();

            return null;
        }
    }
}