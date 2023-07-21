package threads;

public class ProgramThread2 {
    public static void main(String[] args) {
// создание дочернего потока
       // System.out.println("Started");
       // System.out.println("Finished");
       // Thread1 thread1 = new Thread1("Thread1");
       // thread1.start();

        //Создание нескольких дочерних потоков
    // for (int i = 1; i<4;i++){
    //     new Thread1("Thread1 "+ i).start();
     //      }
     //   System.out.println("Start");
     //   System.out.println("Finished");
        //Ожидание завершения всех дочерних потоков
           System.out.println("Start Main");

            Thread1 thread2 = new Thread1("Thread2");
            Thread1 thread3 = new Thread1("Thread3");
            Thread1 thread4 = new Thread1("Thread4");
            thread2.start();
            thread3.start();
            thread4.start();
        try {
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            System.out.printf("%s был остоновлен", thread2.getName());
        }
        System.out.println("Finished");
    }


}


class Thread1 extends Thread
{
    public Thread1  (String name)
    {
        super(name);

    }

    public void run(){
        System.out.printf("%s started thread: \n", Thread1.currentThread().getName());

        try {
            Thread1.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s finished thread: \n", Thread1.currentThread().getName());

    }


}