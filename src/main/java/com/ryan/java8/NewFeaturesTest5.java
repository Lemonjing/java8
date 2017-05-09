package com.ryan.java8;

/**
 * default method & static method
 */
public class NewFeaturesTest5 {
    public static void main(String args[]) {
        Younger younger = new Student();
        younger.print();

        Learner learner = new Student();
        learner.print();
    }
}

interface Younger {
    default void print() {
        System.out.println("I am a younger.");
    }

    static void sayHi() {
        System.out.println("Younger say Hi.");
    }
}

interface Learner {
    default void print() {
        System.out.println("I am a learner.");
    }
}

class Student implements Younger, Learner {
    public void print() {
        Younger.super.print(); // I am a younger
        Learner.super.print(); // I am a learner
        Younger.sayHi(); // Younger say Hi
        System.out.println("I am a student!");
    }
}
