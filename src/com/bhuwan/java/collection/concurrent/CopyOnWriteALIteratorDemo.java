/**
 * 
 */
package com.bhuwan.java.collection.concurrent;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author bhuwan
 *
 */
public class CopyOnWriteALIteratorDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // if you use normal array list object then you will get CME.
        // List<String> list = new ArrayList<>();
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        list.add("Bhuwan");
        list.add("Raju");
        list.add("Suman");
        list.add("Rajesh");
        System.out.println("Original List: " + list);
        Iterator<String> itr = list.iterator();
        // Since when you try to add object on cowal object, a separate copy of the cowal object will be created. Hence, iterator cannot
        // print the object added later.
        list.add("Sanskrit");
        while (itr.hasNext()) {
            String next = itr.next();
            System.out.println("Inside Iterator: " + next);
        }
        System.out.println("After operation: " + list);
    }

}
