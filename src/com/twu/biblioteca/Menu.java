package com.twu.biblioteca;

import com.twu.biblioteca.book.Book;
import com.twu.biblioteca.movie.Movie;
import com.twu.biblioteca.output.Output;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static final String YES = "y";
    private Output output = new Output();
    private Scanner keyboard = new Scanner(System.in);
    Biblioteca biblioteca = new Biblioteca();

    public void welcomeMessage(){
        System.out.println(output.showWelcomeMessage());
        System.out.println();
    }

    public void menuLoop(){

        while(true){
            output.showMenuOptions();
            output.showEnterOptionMessage();
            int option = keyboard.nextInt();
            this.controlOptions(option);
        }
    }

    private void controlOptions(int option){
        switch (option){
            case 1: {
                output.showAllBookMessage();
                printBooksList(biblioteca.allAvailableBooks());
                this.checkoutBook();
                break;

            }

            case 2: {
                printBooksList(biblioteca.allUnavailableBooks());
                this.returnBook();
                break;
            }

            case 3: {
                printMoviesList(biblioteca.getAllMovies());
                this.checkoutMovie();
                break;
            }

            case 0: {
                output.showThankYouForVisitMessage();
                System.exit(0);
            }

            default:{
                System.out.println(output.showInvalidMenuOptionMessage());
                break;
            }
        }
    }

    private void printMoviesList(ArrayList<Movie> allMovies) {
        int index = 0;
        for (Movie movie: allMovies) {
            System.out.printf(index++ + ". %-15s %-15s %-10s %-10s %-10s\n",
                    movie.getName(), movie.getYear(), movie.getDirector(), movie.getRating(),
                    (movie.isAvailable() ? "AVAILABLE" : "UNAVAILABLE") );
        };
    }

    private void checkoutMovie() {
        output.showWantCheckoutMovieMessage();
        String checkOut = keyboard.next().toLowerCase();
        if(YES.equals(checkOut)){
            output.showTypeCheckoutMovieNumberMessage();
            int movieNumber = keyboard.nextInt();
            if (movieNumber < biblioteca.getAllMovies().size()){
                biblioteca.checkoutMovie(movieNumber);
                System.out.println(output.showCheckoutMovieSuccessMessage());
            } else {
                System.out.println(output.showInvalidCheckoutMovieMessage());
                checkoutMovie();
            }
        }
    }

    private void returnBook() {
        output.showWantReturnABookMessage();
        int returnNumber = keyboard.nextInt();
        if(returnNumber < biblioteca.allUnavailableBooks().size()){
            biblioteca.returnBook(returnNumber);
            System.out.println(output.showReturnBookSuccessMessage());
        } else {
            System.out.println(output.showInvalidBookReturnMessage());
            returnBook();
        }

    }


    private void checkoutBook(){
        output.showWantCheckoutBookMessage();
        String checkOut = keyboard.next().toLowerCase();
        if(YES.equals(checkOut)){
            output.showTypeCheckoutBookNumberMessage();
            int bookNumber = keyboard.nextInt();
            if (bookNumber < biblioteca.allAvailableBooks().size()){
                biblioteca.checkoutBook(bookNumber);
                System.out.println(output.showCheckoutBookSuccessMessage());
            } else {
                System.out.println(output.showInvalidCheckoutBookMessage());
                checkoutBook();
            }
        }
    }

    private void printBooksList(ArrayList<Book> books){
        int i = 0;
        for (Book book: books) {
            System.out.printf(i++ + ". %-40s %-15s %-10s\n", book.getTitle(), book.getAuthor(), book.getYearPublished());
        };
    }


}
