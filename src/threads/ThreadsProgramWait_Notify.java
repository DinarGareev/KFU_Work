package threads;

public class ThreadsProgramWait_Notify {
    public static void main(String[] args) {
ThreadsProgramWait_Notify_Store store = new ThreadsProgramWait_Notify_Store();
ThreadsProgramWait_Notify_Producer producer = new ThreadsProgramWait_Notify_Producer(store);
ThreadsProgramWait_Notify_Consumer consumer = new ThreadsProgramWait_Notify_Consumer(store);
new Thread(producer).start();
new Thread(consumer).start();
    }
}
