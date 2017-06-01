package com.twu.biblioteca;

import com.twu.biblioteca.book.Book;
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
                ;
                printBooksList(biblioteca.allUnavailableBooks());
                this.returnBook();
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

    private void returnBook() {
        output.showWantReturnABookMessage();
        int returnNumber = keyboard.nextInt();
        if(returnNumber < biblioteca.allUnavailableBooks().size()){
            biblioteca.returnBook(returnNumber);
            output.showReturnBookSuccessMessage();
        } else {
            output.showInvalidBookReturnMessage();
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
            System.out.printf(i++ + ". %-15s %-15s %-10s\n", book.getTitle(), book.getAuthor(), book.getYearPublished());
        };
    }


}
