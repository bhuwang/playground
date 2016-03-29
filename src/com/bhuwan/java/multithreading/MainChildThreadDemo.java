/**
 * 
 */
package com.bhuwan.java.multithreading;

/**
 * @author bhuwan
 *
 */
public class MainChildThreadDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // Create child thread object.
        ChildThread thread = new ChildThread();
        // Start the child thread
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main thread count: " + i);
        }

    }

    /**
     * Overloading of main method is possible.
     * 
     * @param a
     */
    public static void main(int a) {

    }

}
