interface Vehicle {

    int SPEED = 60;          // public static final

    void start();            // public abstract

    default void fuel() {
        System.out.println("Uses petrol or diesel");
    }

    static void type() {
        System.out.println("This is a vehicle");
    }
}
class Car implements Vehicle {

    public void start() {
        System.out.println("Car starts with key");
    }
}
public class interface_2 {
    public static void main(String[] args) {

        Vehicle v = new Car();   // interface reference

        v.start();
        v.fuel();
        Vehicle.type();

        System.out.println(Vehicle.SPEED);
    }
}
