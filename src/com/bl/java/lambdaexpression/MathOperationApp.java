package com.bl.java.lambdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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

        // Define the Predicate using a lambda expression to check for even numbers

        Predicate<Integer> isEven = number -> number % 2 == 0;

        System.out.println("Printing only Even Numbers");
        playlist.getNumbers().forEach(number -> {
            if (isEven.test(number)) {
                System.out.println("Even Number: " + number);
            }
        });
    }
}

