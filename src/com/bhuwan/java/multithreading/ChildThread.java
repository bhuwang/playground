/**
 * 
 */
package com.bhuwan.java.multithreading;

/**
 * @author bhuwan
 *
 */
public class ChildThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child thread count: " + i);
        }
    }

    /**
     * Overloaded run method. We can overload but Thread.start() only call no argument run() method.
     * 
     * @param a
     */
    public void run(int i) {
        for (i = 0; i < 10; i++) {
            System.out.println("Overloaded method.....Child thread count: " + i);
        }
    }

}
