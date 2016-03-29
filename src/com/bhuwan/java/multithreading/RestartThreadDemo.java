/**
 * 
 */
package com.bhuwan.java.multithreading;

/**
 * @author bhuwan
 *
 */
public class RestartThreadDemo extends Thread {

    /**
     * @param args
     */
    public static void main(String[] args) {
        RestartThreadDemo thread = new RestartThreadDemo();
        thread.start();
        System.out.println("Thread started once.....");

        System.out.println("Trying to restart the same thread again.....");
        // System will throw IllegalThreadStateException because you cannot restart the thread which was already started.
        thread.start();
    }

}
