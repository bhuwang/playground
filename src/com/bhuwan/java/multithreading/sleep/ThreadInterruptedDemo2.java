/**
 * 
 */
package com.bhuwan.java.multithreading.sleep;

/**
 * @author bhuwan
 *
 */
public class ThreadInterruptedDemo2 {

    /**
     * If the target thread not in sleeping or waiting state there is no impact of interrupt call immediately. Interrupt call will be waited
     * until target thread entered into sleeping or waiting state.
     * 
     * If the target thread never entered into sleeping or waiting state in its lifetime then there is no impact of interrupt call. This is
     * the only case where interrupt call will be wasted.
     * 
     * @param args
     */
    public static void main(String[] args) {
        LazyThreadWithSomeWork childThread = new LazyThreadWithSomeWork();
        childThread.start();
        childThread.interrupt();
        System.out.println("End of main!!!");
    }

}

class LazyThreadWithSomeWork extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 1000; i++) {
                System.out.println("I am working = " + i);

            }
            System.out.println("I want to sleep......");
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
