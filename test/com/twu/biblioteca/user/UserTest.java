package com.twu.biblioteca.user;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class UserTest {
    
    private User user;
    
    @Before
    public void setUp(){
        user = new User("829-1212","Laura", "laura@laura.com", "87 99898-9999",
                "123456");
        
    }

    @Test
    public void shouldHaveLibraryNumber() {
        assertThat(user.getLibraryNumber(), is("829-1212"));
    }

    @Test
    public void shouldHaveName() {
        assertThat(user.getName(), is("Laura"));
    }

    @Test
    public void shouldHaveEmail() {
        assertThat(user.getEmail(), is ("laura@laura.com"));
    }

    @Test
    public void phoneNumber() {
        assertThat(user.getPhoneNumber(), is("87 99898-9999"));
    }

    @Test
    public void shouldHavePassword() {
        assertThat(user.getPassword(), is ("123456"));
    }
}