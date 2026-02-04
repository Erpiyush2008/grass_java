class Employee {

    private int empId;     // encapsulated
    public String name;    // not encapsulated

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }
}
public class partiallyencapsulated {
    public static void main(String[] args) {

        Employee e = new Employee();
        e.setEmpId(201);
        e.name = "Rahul";   // direct access

        System.out.println(e.getEmpId());
        System.out.println(e.name);
    }
}
