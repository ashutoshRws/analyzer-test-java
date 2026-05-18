package com.analyzer.models;

public class User {
    private final int id;
    private final String name;

    private User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static User create(String name) {
        return new User(1, name);
    }

    public String getName() {
        return name;
    }
}
