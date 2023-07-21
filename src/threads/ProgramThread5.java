package threads;

public class ProgramThread5 {
    public static void main(String[] args) {
        System.out.println("Основной поток начинается------------------------------");
        MyThread4 myThread = new MyThread4("MyThread");
        myThread.start();
        try {
            Thread.sleep(30);
            myThread.interrupt();
            Thread.sleep(20);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Основной поток завершился------------------------------");
    }
}

 class MyThread4 extends Thread{

    MyThread4(String name){
        super(name);
    }

     @Override
     public void run() {
         System.out.printf("%s started \n", Thread.currentThread().getName());

         int current = 1;
         while (!isInterrupted()){
             System.out.println("Cycle: "+ current++);
         }

         System.out.printf("%s finished \n",Thread.currentThread().getName());



     }
 }
