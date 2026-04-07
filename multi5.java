 public class multi5 {
    public static void main(String[] args) {

        Thread t1= new Thread(){
            @Override
            public void run(){
         System.out.print("thread t1 is running");
            }
        };

        t1.start();
    }
}