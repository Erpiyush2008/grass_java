class Parent {

    Parent() {
        System.out.println("Parent class constructor called");
    }
}

class Child extends Parent {

    Child() {
                System.out.println("Child class constrsuctor called");
    }
}

class GrandChild extends Child {

    GrandChild() {
        System.out.println("GrandChild class constructor called");
    }
}



public class ConstructorInheritanceDemo {

    public static void main(String[] args) {
        Child obj = new Child();
 GrandChild obj1 = new GrandChild();
    }
}
