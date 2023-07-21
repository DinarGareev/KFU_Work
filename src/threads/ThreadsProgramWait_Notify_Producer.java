package threads;

public class ThreadsProgramWait_Notify_Producer implements Runnable {  //класс производителя

    ThreadsProgramWait_Notify_Store store;

    ThreadsProgramWait_Notify_Producer(ThreadsProgramWait_Notify_Store store){
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 1; i<6;i++){
            store.put();
        }
    }
}
