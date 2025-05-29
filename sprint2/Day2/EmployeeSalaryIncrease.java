import java.util.*;

class Employee {
    private int empId;
    private String name;
    private double salary;
    private Optional<String> department; // Optional field

    public Employee(int empId, String name, double salary, String department) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.department = Optional.ofNullable(department);
    }

    public Optional<String> getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double amount) {
        this.salary += amount;
    }

    @Override
    public String toString() {
        return "Employee(ID: " + empId + ", Name: " + name + ", Salary: " + salary + ", Department: " + department.orElse("N/A") + ")";
    }
}

public class EmployeeSalaryIncrease {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice", 70000, "IT"),
            new Employee(2, "Bob", 60000, "HR"),
            new Employee(3, "Charlie", 80000, "IT"),
            new Employee(4, "Diana", 65000, null)
        );

        double increment = 5000;

        for (Employee emp : employees) {
            emp.getDepartment().ifPresent(dept -> {
                if (dept.equalsIgnoreCase("IT")) {
                    emp.increaseSalary(increment);
                }
            });
        }

        System.out.println("Employees after salary increment:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
