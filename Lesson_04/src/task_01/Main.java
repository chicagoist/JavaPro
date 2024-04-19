package task_01;

public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(300);
            }catch(Exception e) {

            }
        }
    }
}
