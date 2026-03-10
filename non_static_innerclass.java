class Outer {

    int x = 10;
    private int y = 20;

    public class Inner {

        void display() {
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }
}

 public class non_static_innerclass {

    public static void main(String[] args) {

        Outer o = new Outer();
        Outer.Inner i = o.new Inner();

        i.display();
    }
}