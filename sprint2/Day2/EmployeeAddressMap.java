import java.util.*;
import java.util.stream.Collectors;

class Address {
    private String city;
    private String country;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address(City: " + city + ", Country: " + country + ")";
    }
}

class Employee {
    private String firstName;
    private String lastName;
    private Address address;

    public Employee(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public Address getAddress() {
        return address;
    }
}

public class EmployeeAddressMap {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("John", "Doe", new Address("New York", "USA")),
            new Employee("Alice", "Smith", new Address("London", "UK")),
            new Employee("Bob", "Brown", new Address("Mumbai", "India"))
        );

        Map<String, Address> nameAddressMap = employees.stream()
            .collect(Collectors.toMap(
                e -> e.getFirstName() + e.getLastName(),
                Employee::getAddress
            ));

        System.out.println("Employee Name to Address Map:");
        for (Map.Entry<String, Address> entry : nameAddressMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
