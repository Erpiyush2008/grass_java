class Person {

    String name;

    static {
        System.out.println("Static block of Person class");
    }

    {
        System.out.println("Instance block of Person class");
    }

    Person(String name) {
        this.name = name;  
        System.out.println("Person constructor called");
    }
}

// -----------------------------

class Employee extends Person {

    int empId;

    static {
        System.out.println("Static block of Employee class");
    }

    {
        System.out.println("Instance block of Employee class");
    }

    Employee(String name, int empId) {
        super(name);        // calling parent constructor
        this.empId = empId;
        System.out.println("Employee constructor called");
    }
}

// -----------------------------

class Developer extends Employee {

    String language;

    static {
        System.out.println("Static block of Developer class");
    }

    {
        System.out.println("Instance block of Developer class");
    }

    Developer(String name, int empId, String language) {
        super(name, empId);     // calling Employee constructor
        this.language = language;
        System.out.println("Developer constructor called");
    }

    void display() {
        System.out.println("\n--- Developer Details ---");
        System.out.println("Name     : " + name);
        System.out.println("Emp ID   : " + empId);
        System.out.println("Language : " + language);
    }
}

// -----------------------------

public class MultilevelInheritanceDemo {

    public static void main(String[] args) {

        Developer d = new Developer("Piyush", 101, "Java");
        d.display();
    }
}
