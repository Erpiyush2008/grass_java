class Student {
    String name;
    Student(String name) {
        this.name = name;
    }
}

class Teacher {
    void teach(Student s) {   // Teacher ASSOCIATED with Student
        System.out.println("Teaching " + s.name);
    }
}

public class AssociationDemo {
    public static void main(String[] args) {
        Student s = new Student("Piyush");
        Teacher t = new Teacher();
        t.teach(s);
    }
}
