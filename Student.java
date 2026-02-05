class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Student {

    int id;
    Address addr;

    // Constructor
    Student(int id, Address addr) {
        this.id = id;
        this.addr = addr;
    }

    public static void main(String[] args) {

        Address a1 = new Address("Mumbai");

        Student s1 = new Student(101, a1);

        
        Student s2 = s1;

        // Changing data using s2
        s2.addr.city = "Delhi";

        System.out.println(s1.addr.city); // Delhi
        System.out.println(s2.addr.city); // Delhi
    }
}
