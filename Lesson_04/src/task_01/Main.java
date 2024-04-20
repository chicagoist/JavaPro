package task_01;

public class Main {
    public static void main(String[] args) {
        // Two variant create threads
        // 1. Extends Class Thread
        MyThread01 myThread01 = new MyThread01();
        //myThread01.run();
        myThread01.start();


        // 2. implication interface Runnable
        MyThread02 myThread02 = new MyThread02();
        Thread thread = new Thread(myThread02);
        thread.start();

        // Первый способ: создаём метод класса и вызываем метод run


        for(int i = 0; i < 10; i++) {
            System.out.println("Main thread: " + i);
            try {
                Thread.sleep(300);
            } catch(Exception e) {

            }
        }
    }
}
