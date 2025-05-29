import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private int empId;
    private String name;
    private String gender; // "Male", "Female", etc.

    public Employee(int empId, String name, String gender) {
        this.empId = empId;
        this.name = name;
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Employee(ID: " + empId + ", Name: " + name + ", Gender: " + gender + ")";
    }
}

public class EmployeeGenderGroup {

    // Group by gender and count
    public static Map<String, Long> groupByGenderCount(List<Employee> employeeList) {
        return employeeList.stream()
            .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice", "Female"),
            new Employee(2, "Bob", "Male"),
            new Employee(3, "Charlie", "Male"),
            new Employee(4, "Diana", "Female"),
            new Employee(5, "Eve", "Female")
        );

        Map<String, Long> genderCounts = groupByGenderCount(employees);
        System.out.println("Employee count by gender: " + genderCounts);
    }
}
