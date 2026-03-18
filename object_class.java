//  	
// Creates and returns a copy of this object.
// class Student {
//     String name = "Piyush";

//     public String toString() {
//         return name;
//     }
// }

// public class object_class {
//     public static void main(String[] args) {
//         Student s = new Student();
//         System.out.println(s);  // calls toString()
//     }
// }


// equal to
// Indicates whether some other object is "equal to" this one.


// class A {
//     int x;

//     A(int x) {
//         this.x = x;
//     }

//     public boolean equals(Object obj) {
//         A a = (A) obj;
//         return this.x == a.x;
//     }
// }

// public class object_class {
//     public static void main(String[] args) {
//         A a1 = new A(10);
//         A a2 = new A(10);

//         System.out.println(a1.equals(a2));
//     }
// }




// hash code 
	
// Returns a hash code value for the object.



// class Student {
//     int id;

//     Student(int id) {
//         this.id = id;
//     }

//     public int hashCode() {
//         return id;
//     }
// }

// public class object_class{
//     public static void main(String[] args) {
//         Student s = new Student(5);
//         System.out.println(s.hashCode());
//     }
// }


// get class

// class Student {
// }
// public class object_class{
//     public static void main(String[] args) {
//         Student s = new Student();
//         System.out.println(s.getClass());
//     }
// }


// clone

// Creates and returns a copy of this object. The precise meaning of "copy" may depend on the class of the object. The general intent is that, for any object x, the expression:


class Student implements Cloneable {
    int id = 10;

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
public class object_class{
    public static void main(String[] args) throws Exception {
        Student s1 = new Student();

        Student s2 = (Student) s1.clone();

        System.out.println(s1.id);
    }
}



//


// class object_class {
//     public static void main(String[] args) throws Exception {

//         Object obj = new Object();

//         Thread t = new Thread(() -> {
//             synchronized (obj) {
//                 try {
//                     // obj.wait();
//                     System.out.println("Thread resumed");
//                 } catch (Exception e) {}
//             }
//         });

//         t.start();

//         // Thread.sleep(2000);

//         // synchronized (obj) {
//         //     obj.notify();
//         // }
//     }
// }