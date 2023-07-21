package threads;

public class ProgramThread3 {
    public static void main(String[] args) {

        System.out.println("Main Started");
        Thread myThread = new Thread (new MyThread(),"MyThread");
        myThread.start();

        System.out.println("Main Finished");


    }
}

class MyThread implements Runnable{

    @Override
    public void run() {
        System.out.printf("%s started \n", Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.printf("%s был остоновлен ", Thread.currentThread().getName());
        }
        System.out.printf("%s finished \n", Thread.currentThread().getName());
    }
}
