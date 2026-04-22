
import java.util.*;

public class ListDemo1 {
    public static void main(String[] args) {

        // 1. Creating List
        List<String> list = new ArrayList<>();

        // 2. add() - Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Mango");

        System.out.println("Initial List: " + list);

        // 3. add(index, element)
        list.add(1, "Orange");
        System.out.println("After adding at index 1: " + list);

        // 4. get(index)
        System.out.println("Element at index 2: " + list.get(2));

        // 5. set(index, element)
        list.set(2, "Grapes");
        System.out.println("After replacing index 2: " + list);

        // 6. remove(index)
        list.remove(3);
        System.out.println("After removing index 3: " + list);

        // 7. remove(object)
        list.remove("Apple");
        System.out.println("After removing Apple: " + list);

        // 8. size()
        System.out.println("Size of list: " + list.size());

        // 9. contains()
        System.out.println("Contains Mango? " + list.contains("Mango"));

        // 10. isEmpty()
        System.out.println("Is list empty? " + list.isEmpty());

        // 11. indexOf()
        System.out.println("Index of Mango: " + list.indexOf("Mango"));

        // 12. lastIndexOf()
        list.add("Mango");
        System.out.println("Last index of Mango: " + list.lastIndexOf("Mango"));

        // 13. clear()
        List<String> tempList = new ArrayList<>(list);
        tempList.clear();
        System.out.println("After clear(): " + tempList);

        // 14. addAll()
        List<String> list2 = new ArrayList<>();
        list2.add("Pineapple");
        list2.add("Kiwi");

        list.addAll(list2);
        System.out.println("After addAll(): " + list);

        // 15. removeAll()
        list.removeAll(list2);
        System.out.println("After removeAll(): " + list);

        // 16. retainAll()
        List<String> list3 = new ArrayList<>();
        list3.add("Mango");
        list.retainAll(list3);
        System.out.println("After retainAll(): " + list);

        // 17. equals()
        System.out.println("List equals list3? " + list.equals(list3));

        // 18. hashCode()
        System.out.println("HashCode: " + list.hashCode());

        // 19. iterator()
        Iterator<String> it = list.iterator();
        System.out.print("Using Iterator: ");
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 20. ListIterator()
        ListIterator<String> lit = list.listIterator();
        System.out.print("Forward: ");
        while(lit.hasNext()) {
            System.out.print(lit.next() + " ");
        }

        System.out.print("\nBackward: ");
        while(lit.hasPrevious()) {
            System.out.print(lit.previous() + " ");
        }
        System.out.println();

        // 21. subList()
        List<String> newList = new ArrayList<>();
        newList.add("A");
        newList.add("B");
        newList.add("C");
        newList.add("D");

        System.out.println("SubList (1,3): " + newList.subList(1, 3));

        // 22. toArray()
        Object[] arr = newList.toArray();
        System.out.println("Array: " + Arrays.toString(arr));

        // 23. sort()
        Collections.sort(newList);
        System.out.println("Sorted list: " + newList);

        // 24. reverse()
        Collections.reverse(newList);
        System.out.println("Reversed list: " + newList);

        // 25. shuffle()
        Collections.shuffle(newList);
        System.out.println("Shuffled list: " + newList);
    }
}