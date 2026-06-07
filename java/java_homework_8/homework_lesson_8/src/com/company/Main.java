package com.company;

import com.company.models.Anthology;
import com.company.models.Book;
import com.company.models.Newspaper;
import com.company.models.LibraryCatalog;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Novel", 180);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "Novel", 281);

        List<String> headlines = new ArrayList<>();
        headlines.add("Breaking News");
        headlines.add("Weather Forecast");
        Newspaper newspaper = new Newspaper("Daily News", "2024-02-10", headlines);

        List<Book> anthologyBooks = new ArrayList<>();
        anthologyBooks.add(new Book("Hamlet", "William Shakespeare", "Tragedy", 350));
        anthologyBooks.add(new Book("Pride and Prejudice", "Jane Austen", "Romance", 420));
        Anthology anthology = new Anthology("Classic Works", anthologyBooks);


        LibraryCatalog catalog = new LibraryCatalog();
        catalog.addPublication(book1);
        catalog.addPublication(book2);
        catalog.addPublication(newspaper);
        catalog.addPublication(anthology);


        System.out.println("All publications in the library:");
        catalog.displayAllPublications();


        System.out.println("\nSearch by title:");
        catalog.searchByTitle("The Great Gatsby");


        System.out.println("\nSearch by author:");
        catalog.searchByAuthor("Harper Lee");
    }
}