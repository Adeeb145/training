package org.sprint2day1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class day1_5 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Jack", "Bob", "Jill");
        Predicate<String> startsWithJ = name -> name.startsWith("J");
        List<String> filtered = names.stream()
                .filter(startsWithJ)
                .collect(Collectors.toList());
        System.out.println(filtered); // Output: [John, Jack, Jill]
    }
}
