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

    public void menuLoop(){

        while(true){
            System.out.println(output.showMenuOptions());
            System.out.print(output.showEnterOptionMessage());
            int option = keyboard.nextInt();
            this.controlOptions(option);
        }
    }

    public void controlOptions(int option){
        switch (option){
            case 1: {
                System.out.println(output.showAllBookMessage());
                printBooksList(biblioteca.allAvailableBooks());
                this.checkoutBook();
                break;

            }

            case 2: {
                System.out.println();
                printBooksList(biblioteca.allUnavailableBooks());
                this.returnBook();
                break;
            }

            case 0: {
                System.out.println(output.showThankYouForVisitMessage());
                System.exit(0);
            }
        }
    }

    private void returnBook() {
        System.out.println(output.showWantReturnABookMessage());
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
        System.out.printf(output.showWantCheckoutBookMessage());
        String checkOut = keyboard.next().toLowerCase();
        if(YES.equals(checkOut)){
            System.out.print(output.showTypeCheckoutBookNumberMessage());
            int bookNumber = keyboard.nextInt();
            if (bookNumber < biblioteca.allAvailableBooks().size()){
                biblioteca.checkoutBook(bookNumber);
                System.out.println(output.showCheckoutNumberSuccessMessage());
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
