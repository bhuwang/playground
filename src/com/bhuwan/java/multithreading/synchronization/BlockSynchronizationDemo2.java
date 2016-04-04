/**
 * 
 */
package com.bhuwan.java.multithreading.synchronization;

/**
 * @author bhuwan
 *
 */
public class BlockSynchronizationDemo2 extends Thread {

    DisplayBlockOne d;
    String name;

    public BlockSynchronizationDemo2(DisplayBlockOne d, String name) {
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
        DisplayBlockOne d1 = new DisplayBlockOne();
        DisplayBlockOne d2 = new DisplayBlockOne();
        DisplayBlockOne d3 = new DisplayBlockOne();
        BlockSynchronizationDemo2 thread1 = new BlockSynchronizationDemo2(d1, "Prisha");
        BlockSynchronizationDemo2 thread2 = new BlockSynchronizationDemo2(d2, "Pratiksha");
        BlockSynchronizationDemo2 thread3 = new BlockSynchronizationDemo2(d3, "Bhuwan");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class DisplayBlockOne {
    public void with(String name) throws InterruptedException {
        ;
        ;
        ;
        ;
        ;
        ; // 200 lines of codes
        synchronized (DisplayBlockOne.class) {
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
