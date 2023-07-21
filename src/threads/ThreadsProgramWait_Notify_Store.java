package threads;

public class ThreadsProgramWait_Notify_Store {
    private int product = 0;

    public synchronized void get(){
        while (product < 1){
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        product--;
        System.out.println("Покупатель купил 1 единицу товара");
        System.out.println("Товаров осталось: "+ product);
        notify();
    }

    public synchronized void put(){
        while (product > 5){
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        product++;
        System.out.println("Привезли 1 единицу товара: ");
        System.out.println("Товаров осталось: " + product);
    }
}
