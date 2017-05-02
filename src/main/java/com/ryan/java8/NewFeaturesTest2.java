package com.ryan.java8;

import java.util.Collection;

/**
 * test lambda scope
 */
public class NewFeaturesTest2 {
    String welcome1 = "Hello1 ";
    static String welcome2 = "Hello2 ";

    public static void main(String[] args) {
        String welcome3 = "Hello3 "; // welcome3 is effectively final
//        welcome3 = "HelloWorld3";
        GreetingService greetingService = message -> System.out.println(welcome3 + message);
        greetingService.sayMessage("Java8");
    }

    interface GreetingService {
        void sayMessage(String message);
    }
}
