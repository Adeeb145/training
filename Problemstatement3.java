import java.util.Scanner;

public class UserProfileDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect user information
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume the leftover newline

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        // Create user profile
        UserProfile user = new UserProfile(name, age, email);

        // Print user profile
        System.out.println("\nUser profile created successfully!");
        System.out.println(user);

        scanner.close();
    }
}

class UserProfile {
    private String name;
    private int age;
    private String email;

    public UserProfile(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User Profile:\n" +
               "Name: " + name + "\n" +
               "Age: " + age + "\n" +
               "Email: " + email;
    }
}
