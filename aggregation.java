// aggregation with getters and print

public class aggregation {
    public static void main(String[] args) {

        Dept d = new Dept(110, "CS");
        College c = new College("Arya", d);

         // print details
        System.out.println("College Name: " + c.getName());
        System.out.println("Dept ID: " + c.getDept().getDeptId());
        System.out.println("Dept Name: " + c.getDept().getDeptName());
    }
}

class College {
    private String name;
    private Dept dept;

    College(String name, Dept dept) {
        this.name = name;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public Dept getDept() {
        return dept;
    }
}

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
