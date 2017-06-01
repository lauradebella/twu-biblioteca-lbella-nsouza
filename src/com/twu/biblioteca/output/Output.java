package com.twu.biblioteca.output;

public class Output {

    public String showWelcomeMessage() {
       return "Hello... Welcome to Biblioteca system!";
    }

    public void showMenuOptions() {
        System.out.println("\nOPTION MENU: \n[1] - List Books \n[2] - Return Book \n[0] - Quit");
    }

    public void showEnterOptionMessage() {
        System.out.println( "Enter your option: ");
    }

    public void showAllBookMessage() {
        System.out.println("\nSee all books we have here !!");
    }

    public void showThankYouForVisitMessage() {
        System.out.println("\nThank you for visiting you library!!");
    }

    public void showWantReturnABookMessage() {
        System.out.println("Type the book number you want to return: ");
    }

    public String showReturnBookSuccessMessage() {
        return "Thank you for returning the book.";
    }

    public void showInvalidBookReturnMessage() {
        System.out.println("That is not a valid book to return.");
    }

    public void showWantCheckoutBookMessage() {
        System.out.printf("\nIf you want to checkout a book type Y (else, type any other key to back to main menu):");
    }

    public void showTypeCheckoutBookNumberMessage() {
        System.out.println("Type a book number do you want to checkout: ");
    }

    public String showCheckoutBookSuccessMessage() {
        return "Thank you, enjoy the book!!";
    }

    public String showInvalidCheckoutBookMessage() {
        return "That book is not available. Try again!";
    }

    public String showInvalidMenuOptionMessage() {
        return "Select a valid option!";
    }
}
