package com.company.models;

public abstract class Publication {
    protected String title;

    public Publication(String title) {
        this.title = title;
    }

    public abstract void displayInfo();
}
