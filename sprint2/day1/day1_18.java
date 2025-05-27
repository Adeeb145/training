package org.sprint2day1;
import java.util.function.Function;

interface StringUtils18 {
    static String toUpperCase(String s) {
        return s == null ? null : s.toUpperCase();
    }
}
public class day1_18 {
    public static void main(String[] args) {
        Function<String, String> upperFunc = StringUtils18::toUpperCase;
        System.out.println(upperFunc.apply("hello"));
    }
}
