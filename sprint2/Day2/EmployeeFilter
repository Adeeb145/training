import java.util.*;

class Employee {
    private int empId;
    private String name;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    @Override
    public String toString() {
        return "Employee(ID: " + empId + ", Name: " + name + ")";
    }
}

public class EmployeeFilter {

    public static List<Employee> getMatchingEmployees(List<Integer> employeeIds, List<Employee> employeeList) {
        Set<Integer> idSet = new HashSet<>(employeeIds);
        List<Employee> result = new ArrayList<>();
        for (Employee emp : employeeList) {
            if (idSet.contains(emp.getEmpId())) {
                result.add(emp);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice"),
            new Employee(2, "Bob"),
            new Employee(3, "Charlie"),
            new Employee(4, "David")
        );
        List<Integer> idsToFind = Arrays.asList(2, 4);

        List<Employee> matchingEmployees = getMatchingEmployees(idsToFind, employees);
        System.out.println("Matching Employees: " + matchingEmployees);
    }
}
