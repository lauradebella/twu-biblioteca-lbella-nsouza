package com.twu.biblioteca;

import com.twu.biblioteca.output.Output;

public class BibliotecaApp {

    public static void main(String[] args) {
        Output output = new Output();

        System.out.println(output.showWelcomeMessage());
    }
}
