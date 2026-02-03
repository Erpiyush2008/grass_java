
class Parent {

    Parent() {
        System.out.println("Parent default constructor");
    }

    Parent(int a) {
        System.out.println("Parent parameterized constructor: a = " + a);
    }
}
class Child extends Parent {

    Child() {
        super(); // calls Parent default constructor
        System.out.println("Child default constructor");
    }

    Child(int a, int b) {
        super(a); // calls Parent parameterized constructor
        System.out.println("Child parameterized constructor: b = " + b);
    }
}


class GrandChild extends Child {

    GrandChild() {
        super(); // calls Child default constructor
        System.out.println("GrandChild default constructor");
    }

    GrandChild(int a, int b, int c) {
        super(a, b); // calls Child parameterized constructor
        System.out.println("GrandChild parameterized constructor: c = " + c);
    }
}


public class ConstructorDemo {
    public static void main(String[] args) {

        System.out.println("---- Default Constructor Call ----");
        GrandChild g1 = new GrandChild();

        System.out.println("\n---- Parameterized Constructor Call ----");
        GrandChild g2 = new GrandChild(10, 20, 30);
    }
}
