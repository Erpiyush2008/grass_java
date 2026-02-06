class Student {
    public int a;
    public String name;

    // Parameterized Constructor
    public Student(int a, String name) {
        this.a = a;
        this.name = name;
    }

    // Copy Constructor
    public Student(Student s) {
        this.a = s.a;
        this.name = s.name;
    }

    public void display() {
        System.out.println(a + " " + name);
    }
}

public class para {
    public static void main(String[] args) {

        Student s1 = new Student(10, "piyush");
        Student s2 = new Student(s1); // copy constructor call

        s1.display();
        s2.display();
    }
}
