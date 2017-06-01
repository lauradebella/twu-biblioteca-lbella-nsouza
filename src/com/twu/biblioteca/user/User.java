package com.twu.biblioteca.user;

public class User {


    private String name;
    private String email;
    private String libraryNumber;
    private String phoneNumber;
    private String password;

    public User( String libraryNumber, String name, String email, String phoneNumber, String password) {
        this.name = name;
        this.email = email;
        this.libraryNumber = libraryNumber;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }


    public String getLibraryNumber() {
        return this.libraryNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getPassword() {
        return this.password;
    }
}
