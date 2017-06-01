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

    @Test
    public void shouldCreateAListOfUnavailableBooks(){
        assertThat(biblioteca.allUnavailableBooks().size(), is(1));
    }

    @Test
    public void shouldCheckoutBookAndUpdateAvailableList(){
        int initialBooks = biblioteca.allAvailableBooks().size();
        biblioteca.checkoutBook(0);
        assertThat(biblioteca.allAvailableBooks().size(), is(initialBooks - 1));
    }

    @Test
    public void shouldReturnBookAndUpdateUnavailableList(){
        int initialBooks = biblioteca.allUnavailableBooks().size();
        biblioteca.returnBook(0);
        assertThat(biblioteca.allUnavailableBooks().size(), is(initialBooks - 1));
    }

    @Test
    public void shouldGetAllMovies(){
        assertThat(biblioteca.getAllMovies().size(), is(3));
    }


}