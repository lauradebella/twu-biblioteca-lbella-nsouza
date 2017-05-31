package com.twu.biblioteca.book;

public class Book {


    private final String author;
    private final String title;
    private final Integer yearPublished;
    private boolean available;

    public Book(String author, String title, Integer yearPublished, boolean available) {
        this.author = author;
        this.title = title;
        this.yearPublished = yearPublished;
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }


    public void changeStatus() {
        this.available = !this.available;
    }
}
