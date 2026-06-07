package com.company.models;

public class Book extends Publication {
    public String author;
    private String genre;
    private int pageCount;

    public Book(String title, String author, String genre, int pageCount) {
        super(title);
        this.author = author;
        this.genre = genre;
        this.pageCount = pageCount;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("Page count: " + pageCount);
    }
}

