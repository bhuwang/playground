/**
 * 
 */
package com.bhuwan.java.multithreading.synchronization;

/**
 * @author bhuwan
 *
 */
public class BlockSynchronizationDemo extends Thread {

    DisplayBlockOne d;
    String name;

    public BlockSynchronizationDemo(DisplayBlockOne d, String name) {
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
        DisplayBlockOne d = new DisplayBlockOne();
        BlockSynchronizationDemo thread1 = new BlockSynchronizationDemo(d, "Prisha");
        BlockSynchronizationDemo thread2 = new BlockSynchronizationDemo(d, "Pratiksha");
        BlockSynchronizationDemo thread3 = new BlockSynchronizationDemo(d, "Bhuwan");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class DisplayBlock {
    public void with(String name) throws InterruptedException {
        ;
        ;
        ;
        ;
        ;
        ; // 200 lines of codes
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.print("Good Morning :");
                Thread.sleep(2000);
                System.out.println(name);
            }
        }
        ;
        ;
        ;
        ;
        ;
        ; // another 200 lines of codes
    }
}
