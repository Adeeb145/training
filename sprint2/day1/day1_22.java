package org.sprint2day1;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class day1_22 {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "cherry");
        Consumer<String> printer = s -> System.out.println(s);
        items.forEach(printer);
    }
}
