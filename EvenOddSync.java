class EvenOddSync {
    static int number = 1;
    static final int limit = 10;
    static final Object lock = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            while (number <= limit) {
                synchronized (lock) {
                    if (number % 2 == 0) {
                        try {
                            lock.wait(); // even ka turn → wait
                        } catch (Exception e) {}
                    } else {
                        System.out.println("Odd Thread: " + number);
                        number++;
                        lock.notify(); // even ko jagao
                    }
                }
            }
        });

        Thread t2 = new Thread(() -> {
            while (number <= limit) {
                synchronized (lock) {
                    if (number % 2 != 0) {
                        try {
                            lock.wait(); 
                        } catch (Exception e) {}
                    } else {
                        System.out.println("Even Thread: " + number);
                        number++;
                        lock.notify(); 
                    }
                }
            }
        });

        t1.start();
        t2.start();
    }
}