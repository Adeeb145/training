package org.sprint2day1;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
public class day1_23 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7);
        Consumer<Integer> doubleAndPrint = n -> System.out.println(n * 2);
        numbers.forEach(doubleAndPrint);
    }
}
