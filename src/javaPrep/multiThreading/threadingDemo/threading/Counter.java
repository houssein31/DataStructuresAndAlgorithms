package javaPrep.multiThreading.threadingDemo.threading;

public class Counter implements Runnable{


    @Override
    public void run(){

        int upperLimit = 100;

        for(int count = 1; count<=upperLimit; count++) {
            System.out.println(Thread.currentThread().getName() + "count is: " + count);
        }

        System.out.println(Thread.currentThread().getName() + " is finished.");
    }
}
