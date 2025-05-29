import java.util.*;
import java.util.stream.*;

class Employee {
    private int empId;
    private String name;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee(ID: " + empId + ", Name: " + name + ")";
    }
}

public class EmployeeFindAnyFirst {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice"),
            new Employee(2, "Bob"),
            new Employee(3, "Charlie")
        );

        // Find the first employee
        Optional<Employee> firstEmp = employees.stream().findFirst();
        // Find any employee
        Optional<Employee> anyEmp = employees.stream().findAny();

        System.out.println("First Employee: " + firstEmp.orElse(null));
        System.out.println("Any Employee: " + anyEmp.orElse(null));
    }
}
