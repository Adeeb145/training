package sprint2day2;

import java.util.*;
import java.util.stream.Collectors;

public class day2_3 {
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

        @Override
        public String toString() {
            return firstName + " " + lastName;
        }
    }

    public static void main(String[] args) {
        Map<String, List<Employee>> departmentEmployees = new HashMap<>();
        departmentEmployees.put("HR", Arrays.asList(
                new Employee("John", "Doe"),
                new Employee("Alice", "Johnson")
        ));
        departmentEmployees.put("IT", Arrays.asList(
                new Employee("Jane", "Smith"),
                new Employee("Bob", "Williams")
        ));

        String search = "jo"; // Example search string

        List<Employee> result = departmentEmployees.values().stream()
                .flatMap(List::stream)
                .filter(emp -> emp.getFirstName().toLowerCase().contains(search.toLowerCase()) ||
                        emp.getLastName().toLowerCase().contains(search.toLowerCase()))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
