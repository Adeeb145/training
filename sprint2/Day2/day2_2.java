package sprint2day2;

import java.util.*;
import java.util.stream.Collectors;

public class day2_2 {
    static class Employee {
        private String firstName;
        private String lastName;
        private String department;
        public Employee(String firstName, String lastName, String department) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.department = department;
        }
        public String getDepartment() {
            return department;
        }
    }
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", "Doe", "HR"),
                new Employee("Jane", "Smith", "IT"),
                new Employee("Alice", "Johnson", "HR"),
                new Employee("Bob", "Williams", "IT"),
                new Employee("Charlie", "Brown", "Finance")
        );
        Map<String, Long> departmentCount = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.counting()
                ));
        System.out.println(departmentCount);
    }
}
