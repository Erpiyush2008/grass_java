public class vol {
    static volatile boolean flag = false;

    public static void main(String[] args) {
        
        new Thread(() -> {
            while (!flag) {
                // will stop correctly ✅
            }
            System.out.println("Stopped");
        }).start();

        new Thread(() -> {
            flag = true;
        }).start();
    }
}