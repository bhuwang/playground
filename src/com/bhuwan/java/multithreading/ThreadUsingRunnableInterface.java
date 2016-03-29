/**
 * 
 */
package com.bhuwan.java.multithreading;

/**
 * @author bhuwan
 *
 */
public class ThreadUsingRunnableInterface implements Runnable {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ThreadUsingRunnableInterface runnable = new ThreadUsingRunnableInterface();
        Thread thread = new Thread(runnable);
        // start a child thread
        thread.start();
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread: " + i);
        }
        System.out.println("Main method ended!!");
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread started: " + i);
        }
    }

}
