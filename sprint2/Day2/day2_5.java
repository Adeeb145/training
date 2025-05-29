package sprint2day2;

import java.util.*;
        import java.util.stream.Collectors;

class Employee {
    private String firstName;
    private String lastName;
    private String department;

    public Employee(String firstName, String lastName, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }
    public String getDepartment() { return department; }
    public String toString() { return firstName + " " + lastName; }
}

public class day2_5 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", "Doe", "HR"),
                new Employee("Jane", "Smith", "IT"),
                new Employee("Alice", "Johnson", "Finance")
        );
        String dept = "IT";
        List<Employee> result = employees.stream()
                .filter(emp -> !emp.getDepartment().equals(dept))
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
