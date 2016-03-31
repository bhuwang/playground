/**
 * 
 */
package com.bhuwan.java.multithreading.join;

/**
 * @author bhuwan
 *
 */
public class JoinDemo {

    /**
     * In this case main thread wait until child thread completes its execution.
     * 
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        JoinChildThread childThread = new JoinChildThread();
        childThread.start();

        // main thread joins child thread
        childThread.join();

        // call join with specified timeframe
        // childThread.join(10000);

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }

}

class JoinChildThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}