package com.bl.java.lambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MathOperationApp {

    public static void main(String[] args) {

        // Create a List of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // 1. Using a Proper Class for Iteration
        System.out.println("Using a Proper Class:");
        NumberConsumer numberConsumer = new NumberConsumer();  // Create an instance of the class
        numbers.forEach(numberConsumer);  // Pass the class to forEach

        // 2. Using Anonymous Class for Iteration
        System.out.println("\nUsing an Anonymous Class:");
        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer number) {
                System.out.println("Number: " + number);
            }
        });

        // 3. Using Lambda Expression for Iteration
        System.out.println("\nUsing a Lambda Expression:");
        numbers.forEach(number -> System.out.println("Number: " + number));
    }

}
    // 1. Define a Proper Class for Iteration
    class NumberConsumer implements Consumer<Integer> {
        @Override
        public void accept(Integer number) {
            System.out.println("Number: " + number);
        }
    }

