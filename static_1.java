class Demo {
    static int x;

    static {
        x = 100;
        System.out.println("Static block executed");
    }

    static void display() {
        System.out.println(x);
    }
}

public class static_1 {
    public static void main(String[] args) {
        Demo.display();
    }
}
