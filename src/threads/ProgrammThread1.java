package threads;

public class ProgrammThread1 {
    public static void main(String[] args) {
        //чтобы создать поток, нам нужно создать объект этого класса

        Thread thread = Thread.currentThread();
        System.out.println(thread);
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());
    }
}
