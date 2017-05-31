package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BibliotecaTest {

    private Biblioteca biblioteca;

    @Before
    public void setUp(){
        biblioteca = new Biblioteca();
    }

    @Test
    public void shouldGetAllBooks(){
        assertThat(biblioteca.getAllBooks().size(), is(3));
    }

    @Test
    public void shouldCreateAListOfAvailableBooks(){
        assertThat(biblioteca.allAvailableBooks().size(), is(2));
    }

}