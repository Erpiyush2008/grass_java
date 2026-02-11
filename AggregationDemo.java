class Department {
    String deptName;
    Department(String deptName) {
        this.deptName = deptName;
    }
}

class College {
    String collegeName;
    Department dept;   // HAS-A (Aggregation)

    College(String collegeName, Department dept) {
        this.collegeName = collegeName;
        this.dept = dept;
    }
}

public class AggregationDemo {
    public static void main(String[] args) {
        Department d = new Department("CSE");
        College c = new College("ARYA", d);

        System.out.println(c.collegeName);
        System.out.println(c.dept.deptName);
    }
}
