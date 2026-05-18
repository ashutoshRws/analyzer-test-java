package com.analyzer;

import com.analyzer.models.User;
import com.analyzer.utils.Greeter;

public class Main {
    public static void main(String[] args) {
        User user = User.create("tester");
        System.out.println(Greeter.greet(user.getName()));
    }
}
