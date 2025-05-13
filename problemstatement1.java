 import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ClassMetadataDemo {
    public static void main(String[] args) {
        // Create a sample object
        SampleClass sampleObject = new SampleClass();
        
        // Get the Class object using getClass() method from Object
        Class<?> clazz = sampleObject.getClass();
        
        // Print class name
        System.out.println("Class Name: " + clazz.getName());
        
        // Check if it's a simple class (not an array, primitive, or interface)
        System.out.println("Is Simple Class: " + (!clazz.isArray() && !clazz.isPrimitive() && !clazz.isInterface()));
        
        // Get and print all declared methods
        System.out.println("\nDeclared Methods:");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("  " + method.getName() + " - Return Type: " + method.getReturnType().getName());
        }
        
        // Check if the class implements any interfaces
        System.out.println("\nInterfaces:");
        Class<?>[] interfaces = clazz.getInterfaces();
        if (interfaces.length > 0) {
            for (Class<?> iface : interfaces) {
                System.out.println("  " + iface.getName());
            }
        } else {
            System.out.println("  No interfaces implemented");
        }
        
        // Get class modifiers (public, private, etc.)
        System.out.println("\nModifiers: " + Modifier.toString(clazz.getModifiers()));
        
        // Get superclass
        System.out.println("Superclass: " + clazz.getSuperclass().getName());
        
        // Check if it's an interface
        System.out.println("Is Interface: " + clazz.isInterface());
        
        // Check if it's an array
        System.out.println("Is Array: " + clazz.isArray());
        
        // Check if it's a primitive type
        System.out.println("Is Primitive: " + clazz.isPrimitive());
        
        // Get package name
        System.out.println("Package: " + clazz.getPackage().getName());
    }
}

// Sample class implementing an interface for demonstration
class SampleClass implements SampleInterface {
    private int value;
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }
    
    @Override
    public void interfaceMethod() {
        System.out.println("Interface method implementation");
    }
}

interface SampleInterface {
    void interfaceMethod();
}
