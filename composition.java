// composition example

public class composition {

    public static void main(String[] args) {

        College c = new College("Arya", 110, "CS");

        System.out.println(c.getName());
        System.out.println(c.getDept().getDeptId());
        System.out.println(c.getDept().getDeptName());
    }
}

class College {
    private String name;
    private Dept dept;

    // Dept object created inside College (composition)
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
