class Outer {

    public int a = 10;
    private int b = 20;
    protected int c = 30;

    static class Inner {

        void show() {

            Outer obj = new Outer();

            System.out.println(obj.a);
            System.out.println(obj.b);
            System.out.println(obj.c);
        }
    }
}

public class static_inner_class {

    public static void main(String[] args) {

        Outer.Inner obj = new Outer.Inner();
        obj.show();

    }
}