package com.twu.biblioteca;

import com.twu.biblioteca.output.Output;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        Output output = new Output();
        Menu menu = new Menu();

        System.out.println(output.showWelcomeMessage());
        System.out.println();

        menu.menuLoop();

    }
}
