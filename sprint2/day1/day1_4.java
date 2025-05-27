package org.sprint2day1;

@FunctionalInterface
interface Operation {
    int apply(int a, int b);
}

public class day1_4  {
    public static void main(String[] args) {
        Operation add = (a, b) -> a + b;
        Operation multiply = (a, b) -> a * b;

        System.out.println("Addition: " + calculate(5, 3, add));        // Output: 8
        System.out.println("Multiplication: " + calculate(5, 3, multiply)); // Output: 15
    }

    public static int calculate(int a, int b, Operation op) {
        return op.apply(a, b);
    }
}
