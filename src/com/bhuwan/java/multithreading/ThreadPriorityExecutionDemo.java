/**
 * 
 */
package com.bhuwan.java.multithreading;

/**
 * @author bhuwan
 *
 */
public class ThreadPriorityExecutionDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ChildThreadDemo thread = new ChildThreadDemo();
        thread.setPriority(10);
        thread.start();
        System.out.println("Main Thread priority:" + Thread.currentThread().getPriority());
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread.");
        }
    }
}

class ChildThreadDemo extends Thread {
    @Override
    public void run() {
        System.out.println("Child Thread priority:" + Thread.currentThread().getPriority());
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread.");
        }
    }
}
