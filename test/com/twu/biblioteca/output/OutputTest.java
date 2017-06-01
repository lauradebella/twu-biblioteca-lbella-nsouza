package com.twu.biblioteca.output;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


public class OutputTest {

    private Output output;

    @Before
    public void setUp(){
        this.output = new Output();
    }

    @Test
    public void shouldReturnWelcomeMessage(){
        assertThat(output.showWelcomeMessage(), is("Hello... Welcome to Biblioteca system!"));
    }

    @Test
    public void shouldReturnInvalidOptionMessage(){
        assertThat(output.showInvalidMenuOptionMessage(), is("Select a valid option!"));
    }

    @Test
    public void shouldReturnCheckoutSuccessMessage(){
        assertThat(output.showCheckoutBookSuccessMessage(), is("Thank you, enjoy the book!!"));
    }
}