public class ThreadExample {
    public static void main(String[] args) {

        int n = 5;
        int arr[] = {2, 3, 4, 5};

        Thread t1 = new Thread(() -> {
            int sum = 0;
            for (int i = 0; i <= n; i++) {
                sum += i;
            }
            double avg = (double) sum / (n + 1);
            System.out.println("Average = " + avg);
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Squares:");
            for (int x : arr) {
                System.out.println(x + " -> " + (x * x));
            }
        });

        t1.start();

        try {
            t1.join(); 
        } catch (Exception e) {}

        t2.start();
    }
}