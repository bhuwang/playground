/**
 * 
 */
package com.bhuwan.java.multithreading.join;

/**
 * Main thread waits main thread.
 * 
 * @author bhuwan
 *
 */
public class DeadLockCaseSecond extends Thread {

    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Program started..............");
        // Here the main threads join the self to complete. Hence will fall into the deadlock state.
        Thread.currentThread().join();
    }

}
