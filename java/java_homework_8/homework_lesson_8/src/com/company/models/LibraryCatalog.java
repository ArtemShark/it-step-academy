package com.company.models;

import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {
    private List<Publication> publications;

    public LibraryCatalog() {
        this.publications = new ArrayList<>();
    }

    public void addPublication(Publication publication) {
        publications.add(publication);
    }

    public void displayAllPublications() {
        for (Publication publication : publications) {
            publication.displayInfo();
            System.out.println();
        }
    }

    public void searchByTitle(String title) {
        for (Publication publication : publications) {
            if (publication.title.equalsIgnoreCase(title)) {
                publication.displayInfo();
                return;
            }
        }
        System.out.println("Publication with title '" + title + "' not found.");
    }

    public void searchByAuthor(String author) {
        for (Publication publication : publications) {
            if (publication instanceof Book) {
                Book book = (Book) publication;
                if (book.author.equalsIgnoreCase(author)) {
                    book.displayInfo();
                }
            }
        }
    }
}