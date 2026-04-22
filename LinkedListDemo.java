import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {

        // 1. Create LinkedList
        LinkedList<String> list = new LinkedList<>();

        // 2. add() - Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("Initial List: " + list);

        // 3. addFirst() and addLast()
        list.addFirst("Mango");
        list.addLast("Orange");
        System.out.println("After addFirst & addLast: " + list);

        // 4. get(), getFirst(), getLast()
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());
        System.out.println("Element at index 2: " + list.get(2));

        // 5. set()
        list.set(2, "Grapes");
        System.out.println("After set(): " + list);

        // 6. remove(), removeFirst(), removeLast()
        list.remove("Banana");
        list.removeFirst();
        list.removeLast();
        System.out.println("After removals: " + list);

        // 7. size()
        System.out.println("Size: " + list.size());

        // 8. contains()
        System.out.println("Contains Apple? " + list.contains("Apple"));

        // 9. indexOf()
        System.out.println("Index of Grapes: " + list.indexOf("Grapes"));

        // 10. addAll()
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Pineapple");
        list2.add("Kiwi");

        list.addAll(list2);
        System.out.println("After addAll(): " + list);

        // 11. removeAll()
        list.removeAll(list2);
        System.out.println("After removeAll(): " + list);

        // 12. iterator()
        System.out.print("Using Iterator: ");
        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 13. descendingIterator()
        System.out.print("Reverse using descendingIterator: ");
        Iterator<String> dit = list.descendingIterator();
        while(dit.hasNext()) {
            System.out.print(dit.next() + " ");
        }
        System.out.println();

        // 14. clear()
        list.clear();
        System.out.println("After clear(): " + list);

        // 15. isEmpty()
        System.out.println("Is Empty? " + list.isEmpty());
    }
}