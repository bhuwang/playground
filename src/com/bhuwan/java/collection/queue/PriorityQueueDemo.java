/**
 * 
 */
package com.bhuwan.java.collection.queue;

import java.util.PriorityQueue;

/**
 * @author bhuwan
 *
 */
public class PriorityQueueDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // returns null if the queue is empty
        System.out.println(pq.peek());
        // return NSEE if the queue is empty
        // System.out.println(pq.element());
        for (int i = 0; i < 10; i++) {
            pq.offer(i);
        }

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
    }

}
