package com.twu.biblioteca;

import com.twu.biblioteca.book.Book;
import com.twu.biblioteca.output.Output;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lbella on 31/05/17.
 */
public class Menu {

    private Output output = new Output();
    private Scanner keyboard = new Scanner(System.in);
    Biblioteca biblioteca = new Biblioteca();

    public void menuLoop(){

        System.out.println(output.showMenuOptions());
        System.out.print("Enter your option: ");
        int option = keyboard.nextInt();
        this.controlOptions(option);
    }

    public void controlOptions(int option){
        switch (option){
            case 1: {
                System.out.println("\nSee all books we have here !!");
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
                System.out.println("Thank you for visiting you library!!");
                System.exit(0);
            }
        }
    }

    private void returnBook() {
        System.out.println("Type the book number you want to return: ");
        int returnNumber = keyboard.nextInt();
        if(returnNumber < biblioteca.allUnavailableBooks().size()){
            biblioteca.returnBook(returnNumber);
            System.out.println("Thank you for returning the book.");
        } else {
            System.out.println("That is not a valid book to return.");
            returnBook();
        }

    }

    private void checkoutBook(){
        System.out.printf("If you want to checkout a book type Y (else, type any other key): \n ");
        String checkOut = keyboard.next().toLowerCase();
        if(checkOut.equals("y")){
            System.out.print("Type the book number: ");
            int bookNumber = keyboard.nextInt();
            if (bookNumber < biblioteca.allAvailableBooks().size()){
                biblioteca.checkoutBook(bookNumber);
                System.out.println("Thank you, enjoy the book!!");
            } else {
                System.out.println("That book is not available. Try again!");
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
