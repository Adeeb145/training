import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private int empId;
    private String name;
    private String gender; // "Male" or "Female"

    public Employee(int empId, String name, String gender) {
        this.empId = empId;
        this.name = name;
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
    public String getName() {
        return name;
    }
}

public class EmployeeGenderString {

    public static String separateAndFormatEmployees(List<Employee> employees) {
        // Group names by gender
        Map<String, List<String>> genderMap = employees.stream()
            .collect(Collectors.groupingBy(
                e -> e.getGender().toUpperCase(),
                Collectors.mapping(Employee::getName, Collectors.toList())
            ));

        String maleNames = String.join("-", genderMap.getOrDefault("MALE", Collections.emptyList()));
        String femaleNames = String.join("-", genderMap.getOrDefault("FEMALE", Collections.emptyList()));

        return String.format("MALE: [%s], FEMALE: [%s]", maleNames, femaleNames);
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "John", "Male"),
            new Employee(2, "Mike", "Male"),
            new Employee(3, "Alice", "Female"),
            new Employee(4, "Lily", "Female")
        );

        String result = separateAndFormatEmployees(employees);
        System.out.println(result);
    }
}
