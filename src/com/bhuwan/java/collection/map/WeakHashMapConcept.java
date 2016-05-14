/**
 * 
 */
package com.bhuwan.java.collection.map;

import java.util.Map;
import java.util.WeakHashMap;

/**
 * @author bhuwan
 *
 */
public class WeakHashMapConcept {

    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        // run the code with normal HashMap
        // Map<WeakHashMapOne, String> map = new HashMap<>();

        // run the code with normal HashMap
        Map<WeakHashMapOne, String> map = new WeakHashMap<>();

        WeakHashMapOne weak = new WeakHashMapOne();
        map.put(weak, "Bhuwan");
        System.out.println(map.toString());
        weak = null;
        System.gc();
        Thread.sleep(3000);
        System.out.println(map);
    }

}

class WeakHashMapOne {

    public void finalize() {
        System.out.println("Finalized method called....");
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "weak";
    }
}
