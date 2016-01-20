package com.vo;

/**
 * Created by Bohdan on 20.01.16.
 */
public class User {

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
