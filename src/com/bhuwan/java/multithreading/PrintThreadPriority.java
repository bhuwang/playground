/**
 * 
 */
package com.bhuwan.java.multithreading;

/**
 * @author bhuwan
 *
 */
public class PrintThreadPriority extends Thread {

    /**
     * The default priority only for main thread is 5. But for all remaining threads the default priority will be inherited from parent to
     * child.
     * 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Min Priority: " + Thread.MIN_PRIORITY);
        System.out.println("Normal Priority: " + Thread.NORM_PRIORITY);
        System.out.println("Max Priority: " + Thread.MAX_PRIORITY);

        System.out.println("Default Priority: " + Thread.currentThread().getPriority());
        // set priority to 9
        Thread.currentThread().setPriority(9);
        System.out.println("Assigned Priority: " + Thread.currentThread().getPriority());

        PrintThreadPriority childThread = new PrintThreadPriority();
        System.out.println("Child Thread Priority: " + childThread.getPriority());
    }

}
