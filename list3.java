import java.util.*;
public class list3{
    public static void main(String[] args) {
        
        List<Integer> ls= new ArrayList<>();
        ls.add(5);
        ls.add(4);
        ls.add(3);

        ListIterator<Integer> l1 = ls.listIterator();

        while(l1.hasNext()){
            int a = l1.next();
        }
        
      
         while(l1.hasPrevious()){
            int a = l1.previous();
            if()
            System.out.print(a);
        }
    }
}