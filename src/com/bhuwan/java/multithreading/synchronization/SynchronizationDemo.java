/**
 * 
 */
package com.bhuwan.java.multithreading.synchronization;

/**
 * @author bhuwan
 *
 */
public class SynchronizationDemo extends Thread {

    Display d;
    String name;

    public SynchronizationDemo(Display d, String name) {
        this.d = d;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            d.with(name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Display d = new Display();
        SynchronizationDemo thread1 = new SynchronizationDemo(d, "Prisha");
        SynchronizationDemo thread2 = new SynchronizationDemo(d, "Pratiksha");
        SynchronizationDemo thread3 = new SynchronizationDemo(d, "Bhuwan");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Display {
    public synchronized void with(String name) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.print("Good Morning :");
            Thread.sleep(2000);
            System.out.println(name);
        }
    }
}
