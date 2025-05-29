package sprint2day2;

public class Day2_4 {
    public static void main(String[] args) {
        String storeId = "7"; // Example input

        // Pad with leading zeros to make it 4 digits
        String paddedStoreId = String.format("%4s", storeId).replace(' ', '0');

        System.out.println(paddedStoreId); // Output: 0007
    }
}
