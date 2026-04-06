class TableThread extends Thread {
    int number;

    TableThread(int number) {
        this.number = number;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        System.out.println(); // line break after each table
    }
}

public class multi4 {
    public static void main(String[] args) {
        
        // Create and start threads for tables 2 to 10
        for (int i = 2; i <= 10; i++) {
            TableThread t = new TableThread(i);
            t.start();
        }
    }
}