package org.sprint2day1;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class day1_20 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 6, 9, 12, 15, 18);
        Predicate<Integer> divisibleBy2 = n -> n % 2 == 0;
        Predicate<Integer> divisibleBy3 = n -> n % 3 == 0;
        List<Integer> both = numbers.stream()
                .filter(divisibleBy2.and(divisibleBy3))
                .collect(Collectors.toList());
        System.out.println("Divisible by both 2 and 3: " + both);
        List<Integer> either = numbers.stream()
                .filter(divisibleBy2.or(divisibleBy3))
                .collect(Collectors.toList());
        System.out.println("Divisible by 2 or 3: " + either);
    }
}
