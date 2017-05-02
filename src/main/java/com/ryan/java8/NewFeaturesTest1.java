package com.ryan.java8;

/**
 * test lambda expression
 */
public class NewFeaturesTest1 {
    public static void main(String[] args) {
        NewFeaturesTest1 test1 = new NewFeaturesTest1();

        MathOperation add = (int a, int b) -> a+b;

        MathOperation sub = (a, b) -> a-b;

        MathOperation multiply = (int a, int b) -> {return a * b;};

        MathOperation divide = (int a, int b) -> a/b;

        System.out.println("10 + 5 = " + test1.operate(10, 5, add));
        System.out.println("10 - 5 =" + test1.operate(10,5, sub));
        System.out.println("10 * 5 =" + test1.operate(10, 5, multiply));
        System.out.println("10 / 5 =" + test1.operate(10, 5, divide));

        GreetingService greetingService1 = message -> System.out.println("Hello " + message);
        GreetingService greetingService2 = (message) -> System.out.println("Hello " + message);

        greetingService1.sayMessage("Hello");
        greetingService2.sayMessage("World");
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}
