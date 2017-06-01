package com.twu.biblioteca.output;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by lbella on 01/06/17.
 */
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

}