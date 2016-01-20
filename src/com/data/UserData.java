package com.data;

import com.vo.User;

/**
 * Created by Bohdan on 20.01.16.
 */
public class UserData {

    private static User user = new User("admin", "admin");

    public boolean isUserPresent(String login, String password) {
        return login.equals(user.getUsername()) && login.equals(user.getPassword());
    }

}
