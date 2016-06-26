/**
 * 
 */
package com.bhuwan.java.collection.list;

import java.util.ArrayList;

/**
 * @author bhuwan
 *
 */
final public class ListCapacityDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        // List has no way to check the capacity.
        // System.out.println("Initail Capacity: " + list.capacity());
        list.ensureCapacity(12);

        for (int i = 1; i <= 12; i++) {
            list.add(i);
        }
        System.out.println();
        System.out.println("List: " + list);

    }

}
