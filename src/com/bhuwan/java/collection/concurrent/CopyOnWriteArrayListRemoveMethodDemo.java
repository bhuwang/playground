/**
 * 
 */
package com.bhuwan.java.collection.concurrent;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * remove() operation only allowed on normal ArrayList and not on the CopyOnWriteArrayList object.
 * 
 * @author bhuwan
 *
 */
public class CopyOnWriteArrayListRemoveMethodDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // If you create normal list object here, then it should allow remove operation
        // List<String> list = new ArrayList<>();
        // with concurrent array list, you will get UnsupportedOperationException
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        list.add("Bhuwan");
        list.add("Raju");
        list.add("Suman");
        list.add("Rajesh");
        System.out.println("Original List: " + list);
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            String next = itr.next();
            if (next.equals("Suman")) {
                itr.remove();
            }
        }
        System.out.println("After operation: " + list);
    }

}
