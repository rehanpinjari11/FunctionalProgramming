package com.bl.java.lambdaexpression;

import java.util.ArrayList;
import java.util.List;


    //Functional interface for conversion
    @FunctionalInterface
    interface NumberConverter {
        double convert(int number);
    }

    class NumberPlaylist {
        private List<Integer> numbers;

        public NumberPlaylist() {
            numbers = new ArrayList<>();
        }

        public void addNumber(int number) {
            numbers.add(number);
        }

        public List<Integer> getNumbers() {
            return numbers;
        }
    }

public class MathOperationApp {
    public static void main(String[] args) {

        NumberPlaylist playlist = new NumberPlaylist();
        playlist.addNumber(1);
        playlist.addNumber(2);
        playlist.addNumber(3);
        playlist.addNumber(4);
        playlist.addNumber(5);

        //Define the conversion using a lambda expression
        NumberConverter toDouble = number -> (double) number;

        System.out.println("Converting numbers to double and printing:");
        playlist.getNumbers().forEach(number -> {
            double convertedNumber = toDouble.convert(number);
            System.out.println("Number as Double: " + convertedNumber);
        });
    }
}

