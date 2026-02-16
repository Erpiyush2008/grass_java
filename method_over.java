class Parent {
    void show() {
        System.out.println("Parent class show method");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child class show method");
    }
}

public class method_over {
    public static void main(String[] args) {
        Parent p = new Child(); // upcasting
        p.show();               // dynamic dispatch
    }
}

/*



// case 1

class Parent {
    void show() {
        System.out.println("Parent show");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child show");
    }
}

public class Test {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}







// out - child show



//case 2

class Parent {
    void show() {
        System.out.println("Parent show");
    }
}

public class Test {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.show();
    }
}

// output - parent show



// case 3 
//Child c = new Parent(); // ❌ error not allow the java 



// case 4 when method static hai then 

class Parent {
    static void show() {
        System.out.println("Parent static");
    }
}

class Child extends Parent {
    static void show() {
        System.out.println("Child static");
    }
}

public class Test {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();
    }
}


// ouput - parent static 
//because   Static methods → compile-time binding

//













*/