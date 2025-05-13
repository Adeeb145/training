public class StaticControlFlowDemo {
    // Static variable initialization
    static int var1 = 5;

    // First static block
    static {
        System.out.println("var1: " + var1); // var1 is initialized
        method();
        System.out.println("First Static Block");
    }

    // Static method
    public static void method() {
        System.out.println("var2: " + var2); // var2 not yet initialized
    }

    // Second static block
    static {
        System.out.println("Second Static Block");
    }

    // Static variable initialization
    static int var2 = 10;

    // Main method
    public static void main(String[] args) {
        method();
        System.out.println("Main method is executing");
    }
}
