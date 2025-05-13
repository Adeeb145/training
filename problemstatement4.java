import java.util.*;

class eCart {
    private String itemName;
    private double itemValue;
    private int itemId;

    public eCart(String itemName, double itemValue, int itemId) {
        if (itemName == null || itemName.trim().isEmpty()) {
            throw new IllegalArgumentException("Item name cannot be empty.");
        }
        if (itemValue <= 0) {
            throw new IllegalArgumentException("Item value must be positive.");
        }
        if (itemId <= 0) {
            throw new IllegalArgumentException("Item ID must be positive.");
        }
        this.itemName = itemName;
        this.itemValue = itemValue;
        this.itemId = itemId;
    }

    public String getItemName() { return itemName; }
    public double getItemValue() { return itemValue; }
    public int getItemId() { return itemId; }

    @Override
    public String toString() {
        return "eCart[itemId=" + itemId + ", itemName=" + itemName + ", itemValue=" + itemValue + "]";
    }
}

public class ECartDemo {
    public static void main(String[] args) {
        List<eCart> cart = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Example: Add 3 items (you can change the number or loop for more)
        int n = 3;
        for (int i = 1; i <= n; i++) {
            try {
                System.out.println("Enter details for item " + i + ":");
                System.out.print("Item Name: ");
                String name = sc.nextLine();
                System.out.print("Item Value: ");
                double value = Double.parseDouble(sc.nextLine());
                System.out.print("Item ID: ");
                int id = Integer.parseInt(sc.nextLine());

                eCart item = new eCart(name, value, id);
                cart.add(item);
            } catch (Exception e) {
                System.out.println("Invalid input: " + e.getMessage());
                i--; // retry current item
            }
        }

        // Build order summary
        int itemsCount = cart.size();
        double orderTotal = 0;
        for (eCart item : cart) {
            orderTotal += item.getItemValue();
        }

        // Print order summary
        System.out.println("\nOrder Summary:");
        for (eCart item : cart) {
            System.out.println(item);
        }
        System.out.println("Items Count: " + itemsCount);
        System.out.println("Order Total: " + orderTotal);
    }
}
