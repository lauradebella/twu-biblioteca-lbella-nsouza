package com.twu.biblioteca;

import com.twu.biblioteca.output.Output;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        Output output = new Output();
        Scanner keyboard = new Scanner(System.in);

        System.out.println(output.showWelcomeMessage());
        System.out.println();
        System.out.println(output.showMenuOptions());

        System.out.print("Enter your option: ");
        int option = keyboard.nextInt();

    }
}
