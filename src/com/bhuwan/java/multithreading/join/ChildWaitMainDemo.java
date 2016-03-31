/**
 * 
 */
package com.bhuwan.java.multithreading.join;

/**
 * @author bhuwan
 *
 */
public class ChildWaitMainDemo {

    /**
     * In this case child thread wait until main thread completes its execution.
     * 
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) {

        // set the instance of main thread.
        ChildWaitMainThread.mainThread = Thread.currentThread();

        // create child thread object
        ChildWaitMainThread childThread = new ChildWaitMainThread();
        childThread.start();

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(2000);
                System.out.println("Main Thread");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

class ChildWaitMainThread extends Thread {
    public static Thread mainThread;

    @Override
    public void run() {
        try {
            // child thread joins main thread. Waits for main thread to complete.
            mainThread.join();

            // wait for main thread for certain interval of time.
            // mainThread.join(5000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
        }
    }
}
