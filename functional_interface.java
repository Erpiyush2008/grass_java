
@FunctionalInterface
interface Calculator {

    int add(int a, int b);

}

class Demo implements Calculator {

    public int add(int a, int b) {
        return a + b;
    }

}

public class functional_interface  {
    public static void main(String[] args) {

        Demo obj = new Demo();
        System.out.println(obj.add(10, 20));

    }
}
