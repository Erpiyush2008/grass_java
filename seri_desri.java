
import java.io.*;

// Step 1: Class must implement Serializable
class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class seri_desri{
    public static void main(String[] args) throws Exception {

        // Step 2: Create object
        Student s1 = new Student(101, "Piyush");

        // Step 3: Serialize object (write to file)
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("file.txt"));
        oos.writeObject(s1);
        oos.close();

        // Step 4: Deserialize object (read from file)
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("file.txt"));
        Student s2 = (Student) ois.readObject();
        ois.close();

        // Step 5: Print object data
        System.out.println(s2.id + " " + s2.name);
    }
}