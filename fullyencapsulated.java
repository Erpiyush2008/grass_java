class Student {

    private int id;
    private String name;

    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
public class fullyencapsulated {
    public static void main(String[] args) {

        Student s = new Student();
        s.setId(101);
        s.setName("Piyush");

        System.out.println(s.getId());
        System.out.println(s.getName());
    }
}
