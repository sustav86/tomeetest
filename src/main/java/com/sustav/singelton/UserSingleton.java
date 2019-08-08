package com.sustav.singelton;

public class UserSingleton {

    private static UserSingleton instance;

    private UserSingleton() {
    }

    public static synchronized UserSingleton getInstance() {
        if (instance == null) {
            instance = new UserSingleton();
        }

        return instance;
    }
}
