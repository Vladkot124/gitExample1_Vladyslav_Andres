package org.example;

public class Book {
    String title;
    String author;
    String isbn;
    int pages;

    public Book(String title, String author, String isbn, int pages) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Title: " + title + "  Author: " + author + "  Pages: " + pages + "  ISBN: " + isbn;
    }
}
