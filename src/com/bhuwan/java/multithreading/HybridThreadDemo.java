/**
 * 
 */
package com.bhuwan.java.multithreading;

/**
 * @author bhuwan
 *
 */
public class HybridThreadDemo extends Thread {

    /**
     * @param args
     */
    public static void main(String[] args) {
        HybridThreadDemo hybridThread = new HybridThreadDemo();
        Thread thread = new Thread(hybridThread);
        thread.start();
        System.out.println("Main Thread.");
    }

    @Override
    public void run() {
        System.out.println("Child Thread.");
    }

}