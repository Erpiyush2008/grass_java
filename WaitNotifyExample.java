class SharedResource {
    private int data;
    private boolean hasValue = false;

    public synchronized void produce(int value) {
        while (hasValue) {
            try {
                wait(); // wait if value already exists
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        data = value;
        System.out.println("Produced: " + data);
        hasValue = true;

        notify(); // notify consumer
    }

    public synchronized void consume() {
        while (!hasValue) {
            try {
                wait(); // wait if no value
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Consumed: " + data);
        hasValue = false;

        notify(); // notify producer
    }
}

class Producer extends Thread {
    SharedResource resource;

    Producer(SharedResource r) {
        this.resource = r;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.produce(i);
        }
    }
}

class Consumer extends Thread {
    SharedResource resource;

    Consumer(SharedResource r) {
        this.resource = r;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.consume();
        }
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Producer p = new Producer(resource);
        Consumer c = new Consumer(resource);

        p.start();
        c.start();
    }
}