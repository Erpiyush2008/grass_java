
import java.io.*;

// Class must implement Serializable
class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class deserizable_example{
    public static void main(String[] args) throws Exception {

        // Serialization (writing object to file)
        Student s1 = new Student(101, "Piyush");
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("file.txt"));
        oos.writeObject(s1);
        oos.close();

        // Deserialization (reading object from file)
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("file.txt"));
        Student s2 = (Student) ois.readObject();
        ois.close();

        // Display data
        System.out.println(s2.id + " " + s2.name);
    }
}