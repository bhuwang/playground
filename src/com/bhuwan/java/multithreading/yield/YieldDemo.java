/**
 * 
 */
package com.bhuwan.java.multithreading.yield;

/**
 * @author bhuwan
 *
 */
public class YieldDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        YieldThread childThread = new YieldThread();
        childThread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }

}

class YieldThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
            Thread.yield();
        }
    }
}
