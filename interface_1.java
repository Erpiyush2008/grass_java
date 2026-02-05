interface Vehicle {

    void start();
    void stop();
}
class Car implements Vehicle {

    public void start() {
        System.out.println("Car starts with key");
    }

    public void stop() {
        System.out.println("Car stops using brake");
    }
}
class Bike implements Vehicle {

    public void start() {
        System.out.println("Bike starts with self start");
    }

    public void stop() {
        System.out.println("Bike stops using brake");
    }
}
public class interface_1{

    public static void main(String[] args) {

        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.start();
        v1.stop();

        v2.start();
        v2.stop();
    }
}
