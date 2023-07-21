package threads;

public class ProgramThread6 {
    public static void main(String[] args) {
        Apples apples = new Apples();
        for (int i =1; i<6; i++) {
            Thread thread = new Thread(new CountThread(apples));
            thread.setName("MyThread"+i);
            thread.start();
        }
    }
}

class Apples{
    int x = 10;
}

class CountThread implements Runnable{
    // будет внутри цикла изменть кол-во яблок
    Apples result;

    CountThread(Apples result){
        this.result = result;
    }

    @Override
    public void run() {
        synchronized (result) {
            result.x = 1;
            for (int i = 1; i < 3; i++) {
                System.out.printf("%s получит %d \n", Thread.currentThread().getName(), result.x);
                result.x++;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("Поток остановлен!!!!!!!");
                }
            }
        }
    }
}
