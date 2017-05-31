package com.twu.biblioteca.output;

public class Output {

    public String showWelcomeMessage() {

        return "Hello... Welcome to Biblioteca system!";
    }

    public String showMenuOptions() {
        return "OPTION MENU: \n[1] - List Books \n[2] - Return Book \n[0] - Quit";
    }

    public String showEnterOptionMessage() {
        return  "Enter your option: ";
    }

    public String showAllBookMessage() {
        return "\nSee all books we have here !!";
    }

    public String showThankYouForVisitMessage() {
        return "\nThank you for visiting you library!!";
    }

    public String showWantReturnABookMessage() {
        return "Type the book number you want to return: ";
    }

    public String showReturnBookSuccessMessage() {
        return "Thank you for returning the book.";
    }

    public String showInvalidBookReturnMessage() {
        return "That is not a valid book to return.";
    }

    public String showWantCheckoutBookMessage() {
        return "If you want to checkout a book type YES (else, type any other key): \n ";
    }

    public String showTypeCheckoutBookNumberMessage() {
        return "Type a book number do you want to checkout: ";
    }

    public String showCheckoutNumberSuccessMessage() {
        return "Thank you, enjoy the book!!";
    }

    public String showInvalidCheckoutBookMessage() {
        return "That book is not available. Try again!";
    }
}
