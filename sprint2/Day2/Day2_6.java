package sprint2day2;

import java.util.*;
import java.util.stream.Collectors;

public class Day2_6 {
    static class Employee {
        private String firstName;
        private String lastName;

        public Employee(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        @Override
        public String toString() {
            return firstName + " " + lastName;
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", "Doe"),
                new Employee("Alice", "Johnson"),
                new Employee("Jane", "Smith")
        );

        // Sort employees by first name
        List<Employee> sorted = employees.stream()
                .sorted(Comparator.comparing(Employee::getFirstName))
                .collect(Collectors.toList());

        System.out.println(sorted); // Output: [Alice Johnson, Jane Smith, John Doe]
    }
}
