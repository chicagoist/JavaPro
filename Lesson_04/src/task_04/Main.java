package task_04;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    private static AtomicInteger counter = new AtomicInteger(0);

    public static AtomicInteger getCounter() {
        return counter;
    }

    /*public static synchronized void increment() {
        counter++;
    }*/

    public static void main(String[] args) {

        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        myThread1.start();
        myThread2.start();

        for(int i = 0; i < 1_000_000; i++) {
            counter.incrementAndGet();
        }

        try {
            myThread1.join();
            myThread2.join();
        } catch(InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Значение счётчика: " + counter);
    }
}
