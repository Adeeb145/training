package org.sprint2day1;
interface MathUtil {
    static int square(int x) {
        return x * x;
    }
}
public class day1_14 {
    public static void main(String[] args) {
        int result = MathUtil.square(5);
        System.out.println(result); // Output: 25
    }
}