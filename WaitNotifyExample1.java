
class Shared {
    int data;
    boolean hasValue = false;

    synchronized void produce(int value) throws Exception {
        if(hasValue) wait();

        data = value;
        System.out.println("Produced: " + data);
        hasValue = true;

        notify();
    }

    synchronized void consume() throws Exception {
        if(!hasValue) wait();

        System.out.println("Consumed: " + data);
        hasValue = false;

        notify();
    }
}

public class WaitNotifyExample1 {
    public static void main(String[] args) {
        Shared s = new Shared();

        Thread producer = new Thread(() -> {
            for(int i = 1; i <= 5; i++) {
                try {
                    s.produce(i);
                } catch(Exception e) {}
            }
        });

        Thread consumer = new Thread(() -> {
            for(int i = 1; i <= 5; i++) {
                try {
                    s.consume();
                } catch(Exception e) {}
            }
        });

        producer.start();
        consumer.start();
    }
}