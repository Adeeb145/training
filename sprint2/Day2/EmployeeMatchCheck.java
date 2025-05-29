import java.util.*;
import java.util.stream.*;

class Employee {
    private int empId;
    private String name;
    private String email;
    private String department;

    public Employee(int empId, String name, String email, String department) {
        this.empId = empId;
        this.name = name;
        this.email = email;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee(ID: " + empId + ", Name: " + name + ", Email: " + email + ", Department: " + department + ")";
    }
}

public class EmployeeMatchCheck {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice", "alice@example.com", "HR"),
            new Employee(2, "Bob", "bob@example.com", "IT"),
            new Employee(3, "Charlie", "charlie@example.com", "Finance"),
            new Employee(4, "Diana", null, "HR")
        );

      
        boolean anyFromHR = employees.stream()
            .anyMatch(emp -> "HR".equalsIgnoreCase(emp.getDepartment()));

      
        boolean allHaveEmail = employees.stream()
            .allMatch(emp -> emp.getEmail() != null && !emp.getEmail().isEmpty());

     
        boolean noneNullName = employees.stream()
            .noneMatch(emp -> emp.getName() == null);

        System.out.println("Any employee from HR? " + anyFromHR);
        System.out.println("All employees have email? " + allHaveEmail);
        System.out.println("No employee has null name? " + noneNullName);
    }
}
