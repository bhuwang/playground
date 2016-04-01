/**
 * 
 */
package com.bhuwan.java.multithreading.sleep;

/**
 * @author bhuwan
 *
 */
public class ThreadInterruptedDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        LazyThread childThread = new LazyThread();
        childThread.start();
        childThread.interrupt();
        System.out.println("End of main!!!");
    }

}

class LazyThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("I am a lazy thread.");

                Thread.sleep(2000);
                System.out.println("I got Interrupted!!");

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
