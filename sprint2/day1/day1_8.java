package org.sprint2day1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class day1_8 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("java", "python", "spring");

        Consumer<List<String>> printUppercase = list ->
                list.forEach(s -> System.out.println(s.toUpperCase()));

        printUppercase.accept(names);

    }
}
