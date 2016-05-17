/**
 * 
 */
package com.bhuwan.java.multithreading;

/**
 * @author bhuwan
 *
 */
public class DaemonThreadDemo extends Thread {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Checking weather the main thread is daemon: " + Thread.currentThread().isDaemon());
        DaemonThreadDemo child = new DaemonThreadDemo();
        System.out.println("Checking weather the child thread is daemon: " + child.isDaemon());
        System.out.println();
        System.out.println("Making child thread as daemon thread.");
        child.setDaemon(true);
        System.out.println("Checking weather the child thread is daemon: " + child.isDaemon());
        child.start();
    }

}
