package chapter11;

public class NewThread implements Runnable {
    String name; //Tread execution name
    Thread t;

    NewThread(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New Thread: " + t);
        t.start();// run thread for execution
    }

    //Entry point to the flow of execution
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + "· " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
