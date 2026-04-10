class NumberPrinter {
    int num = 1;
    final int MAX = 10;

    public synchronized void printOdd() {
        while (num <= MAX) {
            if (num % 2 == 0) {
                try {
                    wait(); // wait if even
                } catch (Exception e) {}
            } else {
                System.out.print(num + " ");
                num++;
                notify(); // wake even thread
            }
        }
    }

    public synchronized void printEven() {
        while (num <= MAX) {
            if (num % 2 != 0) {
                try {
                    wait(); // wait if odd
                } catch (Exception e) {}
            } else {
                System.out.print(num + " ");
                num++;
                notify(); // wake odd thread
            }
        }
    }
}

public class sync_ {
    public static void main(String[] args) {

        NumberPrinter obj = new NumberPrinter();

        Thread t1 = new Thread(() -> obj.printOdd());   // odd
        Thread t2 = new Thread(() -> obj.printEven());  // even

        t1.start(); // pehle t1 start
        t2.start();
    }
}