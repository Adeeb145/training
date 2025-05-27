package org.sprint2day1;
import java.util.function.Supplier;
public class day1_21 {
    public static void main(String[] args) {
        Supplier<Double> randomSupplier = Math::random;
        for (int i = 0; i < 5; i++) {
            System.out.println(randomSupplier.get());
        }
    }
}