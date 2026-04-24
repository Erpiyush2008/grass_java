import java.util.*;

public class EnumerationDemo {
    public static void main(String[] args) {

        // Step 1: Create Vector (legacy class)
        Vector<String> v = new Vector<>();

        // Step 2: Add elements
        v.add("Apple");
        v.add("Banana");
        v.add("Mango");
        v.add("Orange");

        // Display original Vector
        System.out.println("Vector Elements: " + v);

        // Step 3: Get Enumeration object
        Enumeration<String> e = v.elements();

        // Step 4: Traverse using Enumeration
        System.out.println("\nTraversing using Enumeration:");
        while (e.hasMoreElements()) {
            String element = e.nextElement();
            System.out.println(element);
        }
    }
}