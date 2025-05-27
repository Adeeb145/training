package org.sprint2day1;

import java.util.*;

public class Example5 {
    public static void main(String[] args) {
        //List<String> list = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five"));
        List<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Mango", "Grape"));


         list.sort(Comparator.reverseOrder());

        System.out.println("Sorted fruits (descending): " + list);
        List<String> words = Arrays.asList("apple", "kiwi", "banana", "fig");


         words.sort(Comparator.comparingInt(String::length));

        System.out.println(words); // Output: [fig, kiwi, apple, banana]
    }
}
