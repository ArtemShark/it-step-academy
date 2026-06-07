package com.company.models;

import java.util.List;

public class Anthology extends Publication {
    private List<Book> books;

    public Anthology(String title, List<Book> books) {
        super(title);
        this.books = books;
    }

    @Override
    public void displayInfo() {
        System.out.println("Anthology: " + title);
        System.out.println("Contents:");
        for (Book book : books) {
            System.out.println("- " + book.title);
        }
    }
}
