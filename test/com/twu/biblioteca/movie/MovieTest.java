package com.twu.biblioteca.movie;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MovieTest {

    private Movie movie;

    @Before
    public void setUp(){
        movie = new Movie("101 Dalmatians", 1996, "Stephen Herek", 9);
    }


    @Test
    public void movieShouldHaveAName(){
        assertThat(movie.getName(), is("101 Dalmatians"));
    }

    @Test
    public void movieShouldHaveYear(){
        assertThat(movie.getYear(), is(1996));
    }

    @Test
    public void movieShouldHaveADirector() {
        assertThat(movie.getDirector(), is("Stephen Herek"));
    }

    @Test
    public void movieShouldHaveARating(){
        assertThat(movie.getRating(), is (9));
    }


}