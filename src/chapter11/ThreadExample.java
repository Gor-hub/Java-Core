package chapter11;

public class ThreadExample {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());
        Thread myNewThread = new Thread(new MyThread(),"MyThread");
        myNewThread.start();
        for (int i = 0; i < 6; i++) {
            System.out.println("MainThread " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
