package com.twu.biblioteca;

import com.twu.biblioteca.book.Book;
import com.twu.biblioteca.output.Output;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

    private ArrayList<Book> allBooks = new ArrayList<>();


    public Biblioteca () {
        allBooks.add(new Book("JK Rowling", "Harry Potter and The Secret Chamber", 1998, true));
        allBooks.add(new Book("JK Rowling", "Harry Potter and The Fire of Goblet", 2000, true));
        allBooks.add(new Book("JK Rowling", "Harry Potter and The Phoenix Order", 2003, false));
    }

    public ArrayList<Book> allAvailableBooks() {
        ArrayList<Book> allAvailableBooks = new ArrayList<>();

        for(Book book : allBooks){
            if(book.isAvailable()){
                allAvailableBooks.add(book);
            }
        }
        return allAvailableBooks;
    }

    public ArrayList<Book> getAllBooks() {
        return allBooks;
    }

    public ArrayList<Book> allUnavailableBooks() {
        ArrayList<Book> allUnavailableBooks = new ArrayList<>();

        for(Book book : allBooks){
            if(!book.isAvailable()){
                allUnavailableBooks.add(book);
            }
        }
        return allUnavailableBooks;
    }

    public void checkoutBook(int bookPosition) {
        this.allAvailableBooks().get(bookPosition).changeStatus();
    }

    public void returnBook(int bookPosition) {
        this.allUnavailableBooks().get(bookPosition).changeStatus();
    }




}
