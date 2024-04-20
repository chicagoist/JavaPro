package task_01;

public class MyThread02 implements Runnable {


    @Override
    public void run() {
        for(int i = 10000; i < 10010; i++) {
            System.out.println("Thread_02: " + i);
            try {
                Thread.sleep(700);
            } catch(Exception e) {

            }
        }
    }
}
