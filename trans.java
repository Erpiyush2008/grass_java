
import java.io.*;

class Demo implements Serializable {
    int id = 1;                       // normal variable
    transient String password = "abc123"; // transient (not saved)
    static int x = 10;                // static (class variable)
    transient static int y = 20;      // static + transient (same as static)
}

public class trans {
    public static void main(String[] args) throws Exception {

        Demo d1 = new Demo();

        // change values before serialization
        d1.id = 100;
        d1.password = "secret";
        Demo.x = 200;
        Demo.y = 300;

        // serialization
        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("data.txt"));
        out.writeObject(d1);
        out.close();

        // change values again before deserialization
        d1.id = 500;
        d1.password = "changed";
        Demo.x = 600;
        Demo.y = 700;

        // deserialization
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("data.txt"));
        Demo d2 = (Demo) in.readObject();
        in.close();

        // output
        System.out.println("id = " + d2.id);
        System.out.println("password = " + d2.password);
        System.out.println("x = " + Demo.x);
        System.out.println("y = " + Demo.y);
    }
}

