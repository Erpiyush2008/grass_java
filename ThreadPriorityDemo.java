class MyThread extends Thread {

    public MyThread(String name) {
        super(name);   // set thread name
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread Name: " + Thread.currentThread().getName() +
                               " | Priority: " + Thread.currentThread().getPriority() +
                               " | Value: " + i);
        }
    }
}

public class ThreadPriorityDemo {

    public static void main(String[] args) {

        // Creating threads
        MyThread t1 = new MyThread("Low Priority Thread");
        MyThread t2 = new MyThread("Normal Priority Thread");
        MyThread t3 = new MyThread("High Priority Thread");

        // Setting priorities
        t1.setPriority(Thread.MIN_PRIORITY);   // 1
        t2.setPriority(Thread.NORM_PRIORITY);  // 5
        t3.setPriority(Thread.MAX_PRIORITY);   // 10

        // Starting threads
        t1.start();
        t2.start();
        t3.start();
    }
}