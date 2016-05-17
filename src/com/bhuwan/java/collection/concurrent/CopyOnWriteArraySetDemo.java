/**
 * 
 */
package com.bhuwan.java.collection.concurrent;

import java.util.concurrent.CopyOnWriteArraySet;

/**
 * CopyOnWriteArraySet implements CopyOnWriteArrayList internally for write operation. All other features are same as CopyOnWriteArrayList.
 * 
 * @author bhuwan
 *
 */
public class CopyOnWriteArraySetDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
        // insertion order preserved, since it uses CopyOnWriteArrayList internally.
        set.add("Sundar");
        set.add("Bhuwan");
        set.add("Yaju");
        set.add("Ravi");
        // null allowed
        set.add(null);
        // Duplicates are not allowed
        set.add("Bhuwan");
        System.out.println(set);
    }

}
