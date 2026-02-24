// Interface
interface Animal {

    // Final variable (constant)
    int age = 5;   // public static final by default

    // Abstract method
    void sound();  // public abstract by default

    // Default method (Java 8+)
    default void sleep() {
        System.out.println("Animal is sleeping...");
    }

    // Static method
    static void info() {
        System.out.println("Animals are living beings.");
    }
}

// First class implementing interface
class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Second class implementing same method
class Cat implements Animal {

    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class InterfaceExample2 {

    public static void main(String[] args) {

        // Interface reference
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound();
        a2.sound();

        a1.sleep();   // default method

        Animal.info();  // static method

        System.out.println("Age: " + Animal.age);
    }
}