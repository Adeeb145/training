import java.util.*;

class Address {
    private String city;
    private String country;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Address(City: " + city + ", Country: " + country + ")";
    }
}

public class AddressSort {
    public static void main(String[] args) {
        List<Address> addresses = Arrays.asList(
            new Address("Mumbai", "India"),
            new Address("Delhi", "India"),
            new Address("London", "UK"),
            new Address("Manchester", "UK"),
            new Address("Delhi", "USA"),
            new Address("Mumbai", "USA")
        );

        addresses.sort(
            Comparator.comparing(Address::getCity)
                      .thenComparing(Address::getCountry)
        );

        System.out.println("Sorted addresses (by city, then country):");
        for (Address addr : addresses) {
            System.out.println(addr);
        }
    }
}
