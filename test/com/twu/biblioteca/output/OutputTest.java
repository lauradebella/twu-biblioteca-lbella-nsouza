package com.twu.biblioteca.output;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class OutputTest {

    private Output output;

    @Before
    public void setUp(){
        output = new Output();
    }

    @Test
    public void shouldShowWelcomeMessage(){
        assertThat(output.showWelcomeMessage(), is("Hello... Welcome to Biblioteca system!"));

    }

    @Test
    public void shouldReturnMenuMessage(){
        assertThat(output.showMenuOptions(), is("OPTION MENU: \n[1] - List Books \n[0] - Quit"));
    }

}