
package sprint2day2;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
public class day2_1 {
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
        Optional<String> fullName = employees.stream()
                .findFirst()
                .map(emp -> emp.getFirstName() + " " + emp.getLastName());
        fullName.ifPresent(System.out::println);
    }
}
