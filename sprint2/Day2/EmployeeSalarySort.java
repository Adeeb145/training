import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private int empId;
    private String name;
    private double salary;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee(ID: " + empId + ", Name: " + name + ", Salary: " + salary + ")";
    }
}

public class EmployeeSalarySort {

    public static List<Employee> sortBySalaryAscending(List<Employee> employees) {
        // Using streams (Java 8+)
        return employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice", 75000),
            new Employee(2, "Bob", 50000),
            new Employee(3, "Charlie", 90000),
            new Employee(4, "Diana", 60000)
        );

        List<Employee> sortedEmployees = sortBySalaryAscending(employees);
        System.out.println("Employees sorted by salary (ascending):");
        for (Employee emp : sortedEmployees) {
            System.out.println(emp);
        }
    }
}
