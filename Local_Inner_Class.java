class Outer {

    // Instance variables
    public int a = 10;
    private int b = 20;
    protected int c = 30;
    int d = 40;   // default

    // Static variable
    static int e = 50;

    // Methods
    public void publicMethod() {
        System.out.println("Public Method");
    }

    private void privateMethod() {
        System.out.println("Private Method");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    void defaultMethod() {
        System.out.println("Default Method");
    }

    void display() {

        int localVar = 100; // effectively final

        // Local Inner Class
        class Inner {

            void show() {

                // Access outer class variables
                System.out.println("Public variable: " + a);
                System.out.println("Private variable: " + b);
                System.out.println("Protected variable: " + c);
                System.out.println("Default variable: " + d);
                System.out.println("Static variable: " + e);

                // Access outer class methods
                publicMethod();
                privateMethod();
                protectedMethod();
                defaultMethod();

                // Access local variable
                System.out.println("Local variable: " + localVar);
            }
        }

        // Creating object of local inner class
        Inner obj = new Inner();
        obj.show();
    }
}

// Main class
public class Local_Inner_Class {

    public static void main(String[] args) {

        Outer o = new Outer();
        o.display();

    }
}