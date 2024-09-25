package com.bl.java.lambdaexpression;

import java.util.Scanner;

public class MathOperationApp {

    // Functional interface for the math operations
    @FunctionalInterface
    interface MathOperation {
        double operate(double a, double b);
    }

    // Functional interface for displaying results
    @FunctionalInterface
    interface ResultDisplay {
        void display(String message);
    }

    // Method to perform the operation
    private static double performOperation(double a, double b, MathOperation operation) {
        return operation.operate(a, b);
    }

    // Method to display the result
    private static void displayResult(String operationType, double a, double b, MathOperation operation, ResultDisplay display) {
        double result = performOperation(a, b, operation);
        display.display("Result of " + operationType + " is " + result);
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

        // Lambda expression for displaying results
        ResultDisplay resultDisplay = message -> System.out.println(message);

        // Performing operations and displaying results
        displayResult("Addition", num1, num2, addition, resultDisplay);
        displayResult("Subtraction", num1, num2, subtraction, resultDisplay);
        displayResult("Division", num1, num2, division, resultDisplay);

    }
}
