package com.aisha.aiimagegenerator.model;

public class ImageRequest {

    private String prompt;
    private String size;
    private String style;

    public ImageRequest() {
    }

    public ImageRequest(String prompt, String size) {
        this.prompt = prompt;
        this.size = size;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}