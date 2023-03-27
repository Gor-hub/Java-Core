package chapter11;

public class MultiThreadDemo {
    public static void main(String[] args) {
        // run threads for execution
        new NewThread("One");
        new NewThread("Two");
        new NewThread("Three");
        // Wait for other threads of execution to complete
        try {
            Thread.sleep(10000);
        } catch (InterruptedException å) {
            System.out.println("Main thread interrupted");
            System.out.println("Main thread finished");
        }
    }
}
