package com.company.models;

import java.util.List;

public class Newspaper extends Publication {
    private String date;
    private List<String> headlines;

    public Newspaper(String title, String date, List<String> headlines) {
        super(title);
        this.date = date;
        this.headlines = headlines;
    }

    @Override
    public void displayInfo() {
        System.out.println("Newspaper: " + title);
        System.out.println("Date: " + date);
        System.out.println("Headlines:");
        for (String headline : headlines) {
            System.out.println("- " + headline);
        }
    }
}
