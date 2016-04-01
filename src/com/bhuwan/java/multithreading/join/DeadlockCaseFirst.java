/**
 * 
 */
package com.bhuwan.java.multithreading.join;

/**
 * @author bhuwan
 *
 */
public class DeadlockCaseFirst {

    /**
     * In this case child thread waits for main thread and main thread waits for child thread. Hence the deadlock happens.
     * 
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {

        // set the instance of main thread.
        DeadLockFirstThread.mainThread = Thread.currentThread();

        // create child thread object
        DeadLockFirstThread childThread = new DeadLockFirstThread();
        childThread.start();

        System.out.println("Program started.....");
        System.out.println("Since both the main and child thread wait for each other, the program will runs into deadlock state. Hence no progress.");
        // main thread joins child thread. Waits for child thread to complete.
        childThread.join();

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

class DeadLockFirstThread extends Thread {
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
