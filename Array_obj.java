class Student {

    private int rollNo;
    private String name;
    private int age;

    public Student() {
        rollNo = 0;
        name = "Not Assigned";
        age = 0;
    }

 
    public Student(int r, String n, int a) {
        rollNo = r;
        name = n;
        age = a;
    }

   
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

  
    public void setRollNo(int r) {
        rollNo = r;
    }

    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

  
    public void display() {
        System.out.println(rollNo + "  " + name + "  " + age);
    }
}
public class Array_obj {
    public static void main(String[] args) {

       
        Student[] students = new Student[3];
     students[0] = new Student(1, "Aman", 20);
        students[1] = new Student(2, "Riya", 19);
        students[2] = new Student(3, "Kunal", 21);

      
        for (int i = 0; i < students.length; i++) {
            students[i].display();
        }
    }
}
