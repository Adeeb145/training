package org.sprint2day1;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class day1_19 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Andrew", "Alex", "Brian");
        List<String> result = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
