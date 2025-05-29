import java.util.Optional;

class Employee {
    private int empId;
    private String name;
    private String address; // This can be null

    public Employee(int empId, String name, String address) {
        this.empId = empId;
        this.name = name;
        this.address = address;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getAddress() {
        return Optional.ofNullable(address);
    }

    // Returns employee details with default address if missing
    public String getDetails() {
        String displayAddress = getAddress().orElse("No Address Provided");
        return "ID: " + empId + ", Name: " + name + ", Address: " + displayAddress;
    }
}

public class EmployeeDefaultAddress {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Alice", "123 Main St");
        Employee emp2 = new Employee(2, "Bob", null);

        System.out.println(emp1.getDetails());
        System.out.println(emp2.getDetails());
    }
}
