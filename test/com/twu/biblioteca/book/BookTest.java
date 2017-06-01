package com.twu.biblioteca.book;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BookTest {

    private Book book;

    @Before
    public void setUp() {
        book = new Book("Emily Dickson", "Prejudice and proud", 1960, true);
    }

    @Test
    public void shouldChangeBookAvailbleStatus(){
        assertThat(book.isAvailable(), is(true));
        book.changeStatus();
        assertThat(book.isAvailable(), is(false));
    }

    @Test
    public void bookShouldHaveAuthor(){
        assertThat(book.getAuthor(), is("Emily Dickson"));
    }

    @Test
    public void bookShouldHaveTitle(){
        assertThat(book.getTitle(), is("Prejudice and proud"));
    }

    @Test
    public void bookShouldHaveYearPublished(){
        assertThat(book.getYearPublished(), is(1960));
    }

    @Test
    public void bookShouldHaveStatus(){
        assertThat(book.isAvailable(), is(true));
    }
}