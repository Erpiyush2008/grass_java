class Animal{
int n;
  Animal(){
this(12);
System.out.println("animal can eat");
}
Animal(int n){
this.n=n;

}
public void displa(){
System.out.println(n);
}



}
class bird extends Animal{
int age;
 bird(){
System.out.println("bird can eat");
}
bird(int age){
this();
this.age=age;
}

public void display(){
System.out.println(age);
}



}
public class common_imp{

public static void main(String args[]){


bird b = new bird(10);
b.display();
b.displa();
}
}
