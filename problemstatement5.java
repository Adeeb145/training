:public class UserDetails {
    // Public variables: accessible to all
    public String name;
    public int id;
    public String email;

    // Private variables: not accessible to all
    private String password;
    private String creditCard;
    private double creditCardBalance;

    // Constructor
    public UserDetails(String name, int id, String email, String password, String creditCard, double creditCardBalance) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.password = password;
        this.creditCard = creditCard;
        this.creditCardBalance = creditCardBalance;
    }

    // Getter and Setter for password (optional, for demonstration)
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    }




Problem statement 6Write a program to access a static method in a parent class from a child class.:
Explanation:In Java, static methods belong to the class, not to instances, and can be accessed using the class name.
When a child class extends a parent class, the static methods of the parent class can be accessed:
Directly using the parent class name: ParentClass.staticMethod();
Using the child class name: ChildClass.staticMethod();
Or even from within the child class without any qualifier (not recommended for clarity).

Solution:class Parent {
    public static void display() {
        System.out.println("Static method in Parent class");
    }
}

class Child extends Parent {
    public static void main(String[] args) {
        // Accessing static method from parent in different ways:

        // 1. Using parent class name
        Parent.display();

        // 2. Using child class name
        Child.display();

        // 3. Directly (from within child class)
        display();
    }
}
