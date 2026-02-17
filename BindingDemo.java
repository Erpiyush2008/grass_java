class Parent {

    int x = 10;

    static void staticMethod() {
        System.out.println("Parent static method");
    }

    void nonStaticMethod() {
        System.out.println("Parent non-static method");
    }
}

class Child extends Parent {

    int x = 20;

    static void staticMethod() {
        System.out.println("Child static method");
    }

    @Override
    void nonStaticMethod() {
        System.out.println("Child non-static method");
    }
}

public class BindingDemo {
    public static void main(String[] args) {

        Parent obj = new Child();

        System.out.println(obj.x);          // 10 (Compile-time binding)
        obj.staticMethod();                // Parent static (Compile-time)
        obj.nonStaticMethod();             // Child non-static (Run-time)
    }
}
