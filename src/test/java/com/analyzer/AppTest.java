package com.analyzer;

import com.analyzer.models.User;
import com.analyzer.utils.Greeter;

public class AppTest {
    public static void main(String[] args) {
        assert Greeter.greet("world").equals("Hello, world");
        assert User.create("a").getName().equals("a");
        System.out.println("ok");
    }
}
