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
                System.out.println("Do you want to check out one ? (Y/N) \n ");
                String checkOut = keyboard.next();
                if(checkOut == "Y" || checkOut == "y"){
                    System.out.print("Type the book number: ");
                    int bookNumber = keyboard.nextInt();
                    biblioteca.checkoutBook(bookNumber);
                }else if (checkOut != "N" || checkOut != "n"){
                    System.out.println("Choose a valid option!");
                }
                break;

            }
        }
    }

    private void printBooksList(ArrayList<Book> books){
        for (Book book: books) {
            System.out.printf("%-15s %-15s %-10s\n", book.getTitle(), book.getAuthor(), book.getYearPublished());
        };
    }


}
