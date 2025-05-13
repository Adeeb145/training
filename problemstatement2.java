public class ObjectMethodsDemo {
    	public static void main(String[] args) {
        	// Create two objects for demonstration
        	Person person1 = new Person("John", 30);
        	Person person2 = new Person("John", 30);
        	Person person3 = person1;
        
        	System.out.println("Demonstrating Object class methods:\n");
        
        	// 1. toString() method demonstration
        	System.out.println("1. toString() Method:");
        	System.out.println("Default toString() for person1: " + person1.toString());
        	System.out.println("Default toString() for person2: " + person2.toString());
        	System.out.println();
        
        	// 2. equals() method demonstration
        	System.out.println("2. equals() Method:");
        	System.out.println("person1.equals(person2): " + person1.equals(person2));
        	System.out.println("person1.equals(person3): " + person1.equals(person3));
        	System.out.println("person1.equals(null): " + person1.equals(null));
        	System.out.println("person1.equals(\"John\"): " + person1.equals("John"));
        	System.out.println();
        
       	// 3. hashCode() method demonstration
        	System.out.println("3. hashCode() Method:");
        	System.out.println("hashCode of person1: " + person1.hashCode());
        	System.out.println("hashCode of person2: " + person2.hashCode());
        	System.out.println("hashCode of person3: " + person3.hashCode());
       	System.out.println();
        
        // 4. getClass() method demonstration
        System.out.println("4. getClass() Method:");
        System.out.println("Class of person1: " + person1.getClass().getName());
        System.out.println("Is person1 instance of Person: " + (person1 instanceof Person));
        System.out.println("Is person1 instance of Object: " + (person1 instanceof Object));
        System.out.println();
        
        // 5. clone() method demonstration (requires implementation of Cloneable)
        System.out.println("5. clone() Method:");
        try {
            CloneablePerson cloneablePerson = new CloneablePerson("Alice", 25);
            CloneablePerson clonedPerson = (CloneablePerson) cloneablePerson.clone();
            
            System.out.println("Original: " + cloneablePerson);
            System.out.println("Clone: " + clonedPerson);
            System.out.println("Are they the same object? " + (cloneablePerson == clonedPerson));
            System.out.println("Do they have the same content? " + cloneablePerson.equals(clonedPerson));
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported: " + e.getMessage());
        }
    }
}

class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Override toString() method from Object class
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
    
    // Override equals() method from Object class
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Person person = (Person) obj;
        return age == person.age && 
               (name == null ? person.name == null : name.equals(person.name));
    }
    
    // Override hashCode() method from Object class
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}

class CloneablePerson extends Person implements Cloneable {
    public CloneablePerson(String name, int age) {
        super(name, age);
    }
    
    // Override clone() method from Object class
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
