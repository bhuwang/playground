/**
 * 
 */
package com.bhuwan.java.multithreading.synchronization;

/**
 * @author bhuwan
 *
 */
public class SynchronizationDemo2 extends Thread {

    /**
     * @param args
     */
    public static void main(String[] args) {
        DisplayNumsAndChars d = new DisplayNumsAndChars();
        MyThreadOne one = new MyThreadOne(d);
        MyThreadTwo two = new MyThreadTwo(d);
        one.start();
        two.start();
    }
}

class DisplayNumsAndChars {
    public synchronized void displayn() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            Thread.sleep(2000);
        }
    }

    public synchronized void displayc() throws InterruptedException {
        for (int i = 65; i < 75; i++) {
            System.out.println((char) i);
            Thread.sleep(2000);
        }
    }
}

class MyThreadOne extends Thread {
    DisplayNumsAndChars d;

    public MyThreadOne(DisplayNumsAndChars d) {
        this.d = d;
    }

    @Override
    public void run() {
        try {
            d.displayn();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyThreadTwo extends Thread {
    DisplayNumsAndChars d;
    String name;

    public MyThreadTwo(DisplayNumsAndChars d) {
        this.d = d;
    }

    @Override
    public void run() {
        try {
            d.displayc();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
