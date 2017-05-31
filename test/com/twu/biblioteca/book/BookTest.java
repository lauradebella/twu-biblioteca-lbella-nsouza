package com.twu.biblioteca.book;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BookTest {

    private Book book;

    @Before
    public void setUp() {
        book = new Book("Prejudice and proud", "Emily Dickson", 1960, true);
    }

    @Test
    public void shouldChangeBookAvailbleStatus(){
        assertThat(book.isAvailable(), is(true));
        book.changeStatus();
        assertThat(book.isAvailable(), is(false));
    }
}