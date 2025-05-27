package org.sprint2day1;

import java.util.ArrayList;

public class day1_7 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(6);
        numbers.add(1);

        // Remove even numbers using Predicate and removeIf
        numbers.removeIf(n -> n % 2 == 0);

        System.out.println(numbers); // Output: [5, 9, 1]
    }
}
