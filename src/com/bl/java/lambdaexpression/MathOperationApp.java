package com.bl.java.lambdaexpression;

import java.util.Scanner;

public class MathOperationApp {

    // Functional interfaces for the math operations
    @FunctionalInterface
    interface MathOperation {
        double operate(double a, double b);
    }

    // Method to perform the operation
    private static double performOperation(double a, double b, MathOperation operation) {
        return operation.operate(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Lambda expressions for operations
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation division = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            return a / b;
        };

        // Performing operations
        System.out.println("Addition: " + performOperation(num1, num2, addition));
        System.out.println("Subtraction: " + performOperation(num1, num2, subtraction));
        System.out.println("Division: " + performOperation(num1, num2, division));

    }

}
