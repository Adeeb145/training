package sprint2day2;

import java.util.*;
import java.util.stream.Collectors;

public class Day2_8 {
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
        public String getLastName() {
            return lastName;
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", "Doe"),
                new Employee("Jane", "Smith"),
                new Employee("Alice", "Johnson")
        );

        String result = employees.stream()
                .map(emp -> emp.getFirstName() + " " + emp.getLastName())
                .collect(Collectors.joining(" | "));

        System.out.println(result);
    }
}
