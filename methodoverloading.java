public class methodoverloading {
     
    public static void m(){
        System.out.println("this is method m");
    }
    public static void m(int x){
        System.out.println(x);
    }
    public static void main(String[] args) {
          m();
          m(10);
    }
}
