
public class aggr_composition {

    public static void main(String[] args) {

        // College object created
        College c = new College("Arya", 110, "CS");

        // Aggregation: Student uses existing College object
        Student s = new Student(1, "Piyush", c);

        System.out.println("Student Name: " + s.getStudentName());
        System.out.println("College Name: " + s.getCollege().getName());
        System.out.println("Dept Id: " + s.getCollege().getDept().getDeptId());
        System.out.println("Dept Name: " + s.getCollege().getDept().getDeptName());
    }
}

// ================== College (Composition) ==================
class College {
    private String name;
    private Dept dept;

    // Dept object created inside College → COMPOSITION
    College(String name, int deptId, String deptName) {
        this.name = name;
        this.dept = new Dept(deptId, deptName);
    }

    public String getName() {
        return name;
    }

    public Dept getDept() {
        return dept;
    }
}

// ================== Dept ==================
class Dept {
    private int deptId;
    private String deptName;

    Dept(int deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public int getDeptId() {
        return deptId;
    }

    public String getDeptName() {
        return deptName;
    }
}

// ================== Student (Aggregation) ==================
class Student {
    private int studentId;
    private String studentName;
    private College college;

    // College object passed from outside → AGGREGATION
    Student(int studentId, String studentName, College college) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.college = college;
    }

    public String getStudentName() {
        return studentName;
    }

    public College getCollege() {
        return college;
    }
}
