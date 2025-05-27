package org.sprint2day1;
import java.util.Arrays;
import java.util.List;
public class day1_17 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "kiwi", "banana", "fig");
        words.sort((s1, s2) -> s1.length() - s2.length());
        System.out.println(words);
    }
}
