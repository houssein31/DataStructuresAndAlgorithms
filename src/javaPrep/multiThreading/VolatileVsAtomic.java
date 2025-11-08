package javaPrep.multiThreading;

import java.util.concurrent.atomic.AtomicInteger;

public class VolatileVsAtomic {
    private static volatile int volatileCount = 0;
    private static AtomicInteger atomicCount = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                volatileCount++; // Not atomic
                atomicCount.incrementAndGet(); // Atomic
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Volatile count: " + volatileCount); // Likely < 2000
        System.out.println("Atomic count: " + atomicCount.get()); // Always 2000
    }
}