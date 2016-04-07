/**
 * 
 */
package com.bhuwan.java.multithreading.reentrant;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Here using {@link ReentrantLock} to make method threadsafe. Uncomment lines inside class ReentrantThread to see the difference.
 * 
 * @author bhuwan
 *
 */
public class ReentrantLockDemo {

    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        final ReentrantThread runner = new ReentrantThread();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                runner.firstThread();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                runner.secondThread();
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        runner.finished();
    }

}

class ReentrantThread {

    private int count = 0;
    // private Lock lock = new ReentrantLock();

    public void increment() {
        for (int i = 0; i < 10000; i++) {
            count++;
        }
    }

    public void firstThread() {
        try {
            // lock.lock();
            increment();
        } finally {
            // lock.unlock();
        }
    }

    public void secondThread() {
        try {
            // lock.lock();
            increment();
        } finally {
            // lock.unlock();
        }
    }

    public void finished() {
        System.out.println("Count is: " + count);
    }
}