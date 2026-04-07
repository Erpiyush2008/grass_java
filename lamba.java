public class lamba {
    public static void main(String[] args) {
        
    Thread t1 = new Thread( ()->System.out.println("thread t1 execute"));

    t1.start();
    
    }
    
}
