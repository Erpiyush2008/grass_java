import java.util.*;

public class ListIteratorDemo {
    public static void main(String[] args) {

        // Step 1: Create ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Step 2: Add elements
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println("Original List: " + list);

        // Step 3: Get ListIterator
        ListIterator<String> litr = list.listIterator();

        // Step 4: Forward Traversal
        System.out.println("\nForward Traversal:");
        while (litr.hasNext()) {
            String element = litr.next();
            System.out.println("Element: " + element);

            // Step 5: Modify element using set()
            if (element.equals("B")) {
                litr.set("B-Updated");
            }

            // Step 6: Add element using add()
            if (element.equals("C")) {
                litr.add("X");
            }
        }

        System.out.println("\nList after modifications: " + list);

        // Step 7: Backward Traversal
        System.out.println("\nBackward Traversal:");
        while (litr.hasPrevious()) {
            String element = litr.previous();
            System.out.println("Element: " + element);

            // Step 8: Remove element using remove()
            if (element.equals("D")) {
                litr.remove();
            }
        }

        System.out.println("\nFinal List: " + list);

        // Step 9: Index methods
        System.out.println("\nUsing Index Methods:");
        ListIterator<String> litr2 = list.listIterator();

        while (litr2.hasNext()) {
            System.out.println(
                "Index: " + litr2.nextIndex() +
                " Value: " + litr2.next()
            );
        }
    }
}