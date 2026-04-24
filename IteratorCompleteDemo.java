import java.util.*;   // Importing utility package

public class IteratorCompleteDemo {
    public static void main(String[] args) {

        // Step 1: Create a Collection (ArrayList)
        ArrayList<Integer> list = new ArrayList<>();

        // Step 2: Add elements into the list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Display original list
        System.out.println("Original List: " + list);

        // Step 3: Create Iterator object
        Iterator<Integer> itr = list.iterator();

        // Step 4: Traverse using hasNext() and next()
        System.out.println("\nTraversing elements:");
        while (itr.hasNext()) {           // checks if element exists
            int num = itr.next();         // gets next element
            System.out.println(num);

            // Step 5: Using remove()
            // Remove elements divisible by 20
            if (num % 20 == 0) {
                itr.remove();             // removes current element safely
            }
        }

        // Display updated list after removal
        System.out.println("\nList after remove(): " + list);

        // Step 6: Using forEachRemaining()
        Iterator<Integer> itr2 = list.iterator();

        System.out.println("\nUsing forEachRemaining():");
        itr2.forEachRemaining((n) -> {    // lambda expression
            System.out.println(n);
        });
    }
}