/**
 * 
 */
package com.bhuwan.java.multithreading.join;

/**
 * @author bhuwan
 *
 */
public class CalculatorDemo {

    public static void main(String[] args) throws InterruptedException {
        CalculatorThread thread = new CalculatorThread();
        thread.start();
        synchronized (thread) {
            thread.wait();
        }
        System.out.println("sum: " + thread.sum);
    }
}

class CalculatorThread extends Thread {

    long sum;

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 1000; i++) {
                sum += i;
            }
            notify();
        }
    }
}
