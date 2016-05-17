/**
 * 
 */
package com.bhuwan.java.collection.concurrent;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

/**
 * This class demonstrate the concurrent modification exception when two different threads working on the same map. Here child thread is
 * modifying the map and main tread trying to iterate the same map. Hence, CME will be occurred.
 * 
 * @author bhuwan
 *
 */
public class ConcurrentHashMapDemo extends Thread {

    // create ConcurrentHashMap object.
    // If you create normal hash map here, then it should throw ConcurrentModificationException
    // static Map<Integer, String> map = new HashMap<>();
    static Map<Integer, String> map = new ConcurrentHashMap<>();

    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        map.put(101, "A");
        map.put(102, "B");
        map.put(103, "C");
        ConcurrentHashMapDemo childThread = new ConcurrentHashMapDemo();
        childThread.start();
        Iterator<Entry<Integer, String>> itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            System.out.println("Main thread iterating on the map and the current entry is: " + itr.next());
            Thread.sleep(2000);
        }
        System.out.println("Original map: " + map);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Child thread updaing the map.........");
        map.put(104, "D");
    }

}
