package com.company;

import com.company.models.Book;
public class MainTask5 {
    public static void main(String[] args) {

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, "Charles Scribner's Sons", "Tragedy", 218);
        System.out.println(book1);

        // Создание объекта книги с использованием перегруженного конструктора
        Book book2 = new Book("1984", "George Orwell", "Dystopian", 328);
        System.out.println(book2);


        book2.setYearOfPublication(1949);
        book2.setPublisher("Secker & Warburg");

        System.out.println();
        System.out.println("Updated book2 info:");
        System.out.println("Title: " + book2.getTitle());
        System.out.println("Author: " + book2.getAuthor());
        System.out.println("Year of Publication: " + book2.getYearOfPublication());
        System.out.println("Publisher: " + book2.getPublisher());
        System.out.println("Genre: " + book2.getGenre());
        System.out.println("Number of Pages: " + book2.getNumberOfPages());
    }
}

