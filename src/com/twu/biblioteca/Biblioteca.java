package com.twu.biblioteca;

import com.twu.biblioteca.book.Book;
import com.twu.biblioteca.movie.Movie;
import com.twu.biblioteca.user.User;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Book> allBooks = new ArrayList<>();
    private ArrayList<Movie> allMovies = new ArrayList<>();
    private ArrayList<User> allUsers = new ArrayList<>();

    public Biblioteca () {
        allBooks.add(new Book("JK Rowling", "Harry Potter and The Secret Chamber", 1998, true));
        allBooks.add(new Book("JK Rowling", "Harry Potter and The Fire of Goblet", 2000, true));
        allBooks.add(new Book("JK Rowling", "Harry Potter and The Phoenix Order", 2003, false));

        allMovies.add(new Movie("Friend with Benefits", 2011, "Will Gluck", 7 ));
        allMovies.add(new Movie("The Godfather", 1972, "Coppola", 9 ));
        allMovies.add(new Movie("Titanic", 1998, "James Cameron", 8 ));

        allUsers.add(new User("123-4567", "JavaScript", "jay@s.com", "12 3453-5555", "123456"));

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


    public ArrayList<Movie> getAllMovies() {
        return allMovies;
    }

    public void checkoutMovie(int movieNumber) {
        this.getAllMovies().get(movieNumber).changeStatus();
    }

    public ArrayList<User> getAllUsers() {
        return allUsers;
    }
}
