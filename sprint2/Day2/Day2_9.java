package sprint2day2;

import java.util.*;

public class Day2_9 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(201, "Amit", "Sharma", "IT"),
                new Employee(202, "Priya", "Verma", "HR"),
                new Employee(203, "Rahul", "Singh", "Finance"),
                new Employee(204, "Sneha", "Patel", "Marketing"),
                new Employee(205, "Vikas", "Gupta", "IT"),
                new Employee(206, "Neha", "Mehra", "HR"),
                new Employee(207, "Rohan", "Jain", "Finance"),
                new Employee(208, "Kavita", "Reddy", "Marketing"),
                new Employee(209, "Suresh", "Yadav", "IT"),
                new Employee(210, "Pooja", "Chopra", "HR")
        );

        // Get the 8th employee (index 7, as list is 0-based)
        if (employees.size() >= 8) {
            Employeelist emp = employee.get(7);
            String fullName = emp.getFirstName() + " " + emp.getLastName();
            String department = emp.getDepartment();
            System.out.println("8th Employee: " + fullName + ", Department: " + department);
        } else {
            System.out.println("Less than 8 employees in the list.");
        }
    }
}
