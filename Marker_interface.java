
interface Marker {

}

class Test implements Marker {

    void show() {
        System.out.println("Marker Interface Example");
    }

}

public class Marker_interface {

    public static void main(String[] args) {

        Test obj = new Test();

        if (obj instanceof Marker) {
            obj.show();
        }

    }

}
