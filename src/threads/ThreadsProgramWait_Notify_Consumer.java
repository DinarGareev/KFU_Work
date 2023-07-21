package threads;

public class ThreadsProgramWait_Notify_Consumer implements Runnable{

    ThreadsProgramWait_Notify_Store store;

    ThreadsProgramWait_Notify_Consumer(ThreadsProgramWait_Notify_Store store) {
        this.store = store;
    }

    public void run(){
        for (int i = 1; i < 6;i++){
            store.get();
        }
    }
}
