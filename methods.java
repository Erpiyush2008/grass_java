public class methods {

    public static void staticMethod(){
        System.out.println("This is Static method");
    }

    public void nonStaticMethod(){
        System.out.println("This is non Static method");
    }
}

class Demo{
    public static void main(String[] args){

        Test.staticMethod();   // static → class name se

        Test t = new Test();   // object create
        t.nonStaticMethod();  // non-static → object se
    }
}
