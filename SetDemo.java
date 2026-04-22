import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        // 1. Create Set (HashSet)
        Set<String> set = new HashSet<>();

        // 2. add() - Add elements
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // duplicate (ignored)

        System.out.println("Set: " + set);

        // 3. size()
        System.out.println("Size: " + set.size());

        // 4. contains()
        System.out.println("Contains Banana? " + set.contains("Banana"));

        // 5. remove()
        set.remove("Cherry");
        System.out.println("After remove Cherry: " + set);

        // 6. isEmpty()
        System.out.println("Is Empty? " + set.isEmpty());

        // 7. addAll()
        Set<String> set2 = new HashSet<>();
        set2.add("Mango");
        set2.add("Orange");

        set.addAll(set2);
        System.out.println("After addAll(): " + set);

        // 8. removeAll()
        set.removeAll(set2);
        System.out.println("After removeAll(): " + set);

        // 9. retainAll()
        Set<String> set3 = new HashSet<>();
        set3.add("Apple");

        set.retainAll(set3);
        System.out.println("After retainAll(): " + set);

        // 10. iterator()
        System.out.print("Using Iterator: ");
        Iterator<String> it = set.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 11. clear()
        set.clear();
        System.out.println("After clear(): " + set);

        // 12. isEmpty()
        System.out.println("Is Empty after clear? " + set.isEmpty());
    }
}