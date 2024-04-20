package task_01;

public class MyThread01 extends Thread {

    @Override
    public void run() {
        for(int i = 100; i < 110; i++) {
            System.out.println("Thread_01: " + i);
            try {
                Thread.sleep(500);
            }catch(Exception e) {

            }
        }
    }
}
