/**
 * 
 */
package com.bhuwan.java.collection.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * This class demonstrate the concurrent modification exception when two different threads working on the same list. Here child thread is
 * modifying the list and main tread trying to iterate the same list. Hence, CME will be occurred.
 * 
 * @author bhuwan
 *
 */
public class ConcurrentModificationDemo extends Thread {

    static List<String> list = new ArrayList<>();

    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        list.add("A");
        list.add("B");
        list.add("C");
        ConcurrentModificationDemo childThread = new ConcurrentModificationDemo();
        childThread.start();
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println("Main thread iterating on the list and the current object is: " + itr.next());
            Thread.sleep(2000);
        }
        System.out.println("Original List: " + list);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Child thread updaing the list.........");
        list.add("D");
    }

}
