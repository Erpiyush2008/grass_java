class Human {
  public int age;
  public String name;

  Human(int age, String name) {
      this.age = age;
      this.name = name;
  }

  public void display() {
      System.out.println("Name is: " + name);
      System.out.println("Age is: " + age);
  }
}
class  boys extends Human
{
  boys(int age , String name){
    super(age, name);
  }
 public void show1(){
  System.out.println("this is boy class");
 }

}

class Student extends boys{
  int a = 10;

  Student(int age, String name) {
      super(age, name);  
  }
 

  public void show() {
      System.out.println("Value of a: " + a);
  }
}


public class main_1 {
  public static void main(String[] args) {
      Student s = new Student(20, "Piyush");
       boys s1 = new boys(10, "pk");
      s.display(); 
      s.show1();
      s1.display();
  }
}
