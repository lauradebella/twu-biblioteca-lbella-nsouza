package com.twu.biblioteca.movie;

public class Movie {
    private String name;
    private Integer year;
    private String director;
    private Integer rating;
    private boolean available;

    public Movie(String name, Integer year, String director, Integer rating) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
        this.available = true;
    }

    public boolean isAvailable() {
        return this.available;
    }

    public String getName() {
        return this.name;
    }

    public Integer getYear() {
        return this.year;
    }

    public String getDirector() {
        return this.director;
    }

    public Integer getRating() {
        return this.rating;
    }

    public void changeStatus() {
        this.available = !this.available;
    }
}
