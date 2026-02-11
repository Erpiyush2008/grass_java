class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Car {
    private Engine engine;

    Car() {
        engine = new Engine();  // Composition
    }

    void drive() {
        engine.start();
        System.out.println("Car is running");
    }
}

public class CompositionDemo {
    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
    }
}
