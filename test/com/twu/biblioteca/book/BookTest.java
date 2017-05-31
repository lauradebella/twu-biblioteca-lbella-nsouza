package com.twu.biblioteca.book;

import org.junit.Before;
import org.junit.Test;

public class BookTest {

    private Book book;

    @Before
    public void setUp() {
        book = new Book("Prejudice and proud", "Emily Dickson", 1960, true);
    }

}