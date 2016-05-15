/**
 * 
 */
package com.bhuwan.java.collection.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author bhuwan
 *
 */
public class PQDemoWithCustomSorting {

    /**
     * @param args
     */
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>(22, new PQCustomComparator());
        queue.offer("Bhuwan");
        queue.offer("Richan");
        queue.offer("Chetan");
        queue.offer("Nirmal");
        queue.offer("Arjun");
        System.out.println(queue);
    }
}

class PQCustomComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }

}
