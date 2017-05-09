package com.ryan.java8;

import java.util.ArrayList;
import java.util.List;

/**
 * method reference
 */
public class NewFeaturesTest2 {
    public static void main(String[] args) {
        List names = new ArrayList();

        names.add("Peter");
        names.add("Lily");
        names.add("Smith");
        names.add("Bob");

        names.forEach(System.out::println);
        names.forEach(x -> System.out.println(x));
    }
}
