class Student {

    String name;
    int rollNo;
    int age;

    // Normal constructor
    Student(String name, int rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    // 🔸 Shallow Copy Constructor
    Student(Student s) {
        this.name = s.name;
        this.rollNo = s.rollNo;
        this.age = s.age;
    }

    // 🔹 Deep Copy Method
    Student deepCopy() {
        return new Student(
                new String(this.name), // new object
                this.rollNo,
                this.age
        );
    }

    void display() {
        System.out.println(name + " " + rollNo + " " + age);
    }
}

public class shallow_and_deep {
    public static void main(String[] args) {

        Student s1 = new Student("Piyush", 101, 20);

        // Shallow Copy
        Student s2 = new Student(s1);

        // Deep Copy
        Student s3 = s1.deepCopy();

        s1.name = "Rahul";

        s1.display(); // Rahul 101 20
        s2.display(); // Rahul 101 20  (affected - shallow)
        s3.display(); // Piyush 101 20 (not affected - deep)
    }
}
