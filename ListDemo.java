import java.util.*;

public class ListDemo {
    public static void main(String[] args) {

        // 1. Create List
        ArrayList<Integer> list = new ArrayList<>();

        // 2. add()
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1, 15); // insert at index

        System.out.println("After add: " + list);

        // 3. get()
        System.out.println("Element at index 2: " + list.get(2));

        // 4. set()
        list.set(2, 25);
        System.out.println("After set: " + list);

        // 5. remove()
        list.remove(1); // remove by index
        list.remove(Integer.valueOf(30)); // remove by value
        System.out.println("After remove: " + list);

        // 6. size()
        System.out.println("Size: " + list.size());

        // 7. contains()
        System.out.println("Contains 25? " + list.contains(25));

        // 8. indexOf()
        System.out.println("Index of 25: " + list.indexOf(25));

        // 9. isEmpty()
        System.out.println("Is empty? " + list.isEmpty());

        // 10. addAll()
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(200);
        list.addAll(list2);
        System.out.println("After addAll: " + list);

        // 11. removeAll()
        list.removeAll(list2);
        System.out.println("After removeAll: " + list);

        // 12. clear()
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(5);
        temp.add(6);
        temp.clear();
        System.out.println("After clear: " + temp);

        // 13. iterator()
        System.out.print("Using Iterator: ");
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        // 14. forEach
        System.out.print("\nUsing forEach: ");
        list.forEach(n -> System.out.print(n + " "));

        // 15. sort()
        list.add(5);
        list.add(2);
        Collections.sort(list);
        System.out.println("\nAfter sort: " + list);

        // 16. subList()
        System.out.println("SubList: " + list.subList(0, 2));

        // 17. toArray()
        Object[] arr = list.toArray();
        System.out.println("Array: " + Arrays.toString(arr));
    }
}