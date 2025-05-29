package sprint2day2;

import java.util.*;
import java.util.stream.*;

public class day2_7 {
    static class Employee {
        private int empId;
        private String firstName;
        private String lastName;

        public Employee(int empId, String firstName, String lastName) {
            this.empId = empId;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public int getEmpId() {
            return empId;
        }

        @Override
        public String toString() {
            return empId + ": " + firstName + " " + lastName;
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(101, "John", "Doe"),
                new Employee(105, "Jane", "Smith"),
                new Employee(103, "Alice", "Johnson")
        );

        Optional<Employee> maxEmp = employees.stream()
                .max(Comparator.comparing(Employee::getEmpId));

        if (maxEmp.isPresent()) {
            System.out.println("Employee with highest empId: " + maxEmp.get());
        } else {
            System.out.println("No employees in the list.");
        }
    }
}
