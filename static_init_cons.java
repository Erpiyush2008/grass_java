class Parent {
    static {
        System.out.println("parent static block");
    }

    {
        System.out.println("parent init block");
    }

    Parent() {
        System.out.println("parent constructor");
    }
}

class Child extends Parent {
    static {
        System.out.println("child static block");
    }

    {
        System.out.println("child init block");
    }

    Child() {
        System.out.println("child constructor");
    }
}

public class static_init_cons {
    public static void main(String[] args) {
        Child c = new Child();
    }
}
