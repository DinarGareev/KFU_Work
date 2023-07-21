package threads;

public class ProgramThread4 {
    public static void main(String[] args) {
        System.out.println("Метод начал свою работу:");
        MYThread1 myThread1 = new MYThread1();
        new Thread(myThread1, "MyThread1").start();
        try {
            Thread.sleep(1000);
            myThread1.disable();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Ошибка");
        }
        System.out.println("Метод закончил свою работу:");
    }
}
     class MYThread1 implements Runnable {
        private boolean isActive;

        void disable() {
            isActive = false;
        }

        MYThread1() {
            isActive = true;
        }


        @Override
        public void run() {
            System.out.printf("%s начал работу", Thread.currentThread().getName());
            int counter = 1;
            while (isActive){
                System.out.println("Цикл"+ counter++);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            }
            System.out.printf("%s завершил работу", Thread.currentThread().getName());
        }
    }



