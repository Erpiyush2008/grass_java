import java.io.*;

class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class serlization_1 {
    public static void main(String[] args) {
        try {
            Student s1 = new Student(1, "Piyush");

            FileOutputStream fos = new FileOutputStream("student.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s1);   // Serialization

            oos.close();
            fos.close();

            System.out.println("Object serialized");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}