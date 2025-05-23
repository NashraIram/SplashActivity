package com.example.splashactivity;

public class Founder {
    private final int imageResId;
    private final String name;
    private final String description;

    public Founder(String imageResId, int name, String description) {
        this.imageResId = Integer.parseInt(imageResId);
        this.name = String.valueOf(name);
        this.description = description;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}