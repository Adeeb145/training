import java.util.Optional;

class Employee {
    private int empId;
    private String name;
    private Optional<String> email;      // Optional field
    private Optional<Double> bonus;      // Optional field

    public Employee(int empId, String name, String email, Double bonus) {
        this.empId = empId;
        this.name = name;
        this.email = Optional.ofNullable(email);
        this.bonus = Optional.ofNullable(bonus);
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getEmail() {
        return email;
    }

    public Optional<Double> getBonus() {
        return bonus;
    }

    // Returns a string with all employee details, using Optional getters
    public String getDetails() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(empId)
          .append(", Name: ").append(name)
          .append(", Email: ").append(email.orElse("N/A"))
          .append(", Bonus: ").append(bonus.map(String::valueOf).orElse("N/A"));
        return sb.toString();
    }
}

public class EmployeeOptionalDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Alice", "alice@example.com", 1000.0);
        Employee emp2 = new Employee(2, "Bob", null, null);

        System.out.println(emp1.getDetails());
        System.out.println(emp2.getDetails());

        // Accessing optional fields individually
        emp1.getEmail().ifPresent(email -> System.out.println("Alice's email: " + email));
        System.out.println("Bob's bonus: " + emp2.getBonus().orElse(0.0));
    }
}
