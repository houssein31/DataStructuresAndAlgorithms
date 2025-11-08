package javaPrep.multiThreading.threadingDemo.threading;

public class Runner {

    public static void main(String[] args) {

//        ThreadExample thread0 = new ThreadExample();
//        thread0.start();
//
//        System.out.println("Hello from the main thead");

        Runnable runnable = new Counter();

        Thread thread0 = new Thread(runnable);
        Thread thread1 = new Thread(runnable);

        thread0.start();
        thread1.start();

//        System.out.println("Last action in the main thread");
//        System.out.println("---> " + Thread.currentThread().getName() + " thread has fiunished.");
    }
}
