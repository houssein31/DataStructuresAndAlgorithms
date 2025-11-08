package javaPrep.multiThreading;

public class DeadlockDemo {
    private final Object lockA = new Object();
    private final Object lockB = new Object();

    public void methodA() {
        synchronized (lockA) {
            System.out.println(Thread.currentThread().getName() + " acquired lockA");
            try { Thread.sleep(100); } catch (InterruptedException ignored) {}
            synchronized (lockB) {
                System.out.println(Thread.currentThread().getName() + " acquired lockB");
            }
        }
    }

    public void methodB() {
        synchronized (lockB) {
            System.out.println(Thread.currentThread().getName() + " acquired lockB");
            try { Thread.sleep(100); } catch (InterruptedException ignored) {}
            synchronized (lockA) {
                System.out.println(Thread.currentThread().getName() + " acquired lockA");
            }
        }
    }

    public static void main(String[] args) {
        DeadlockDemo demo = new DeadlockDemo();

        // Simulate Deadlock
        Thread t1 = new Thread(demo::methodA, "Thread-1");
        Thread t2 = new Thread(demo::methodB, "Thread-2");
        t1.start();
        t2.start();

        // Fix: Always acquire locks in the same order in both methods to avoid deadlock
    }
}