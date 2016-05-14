/**
 * 
 */
package com.bhuwan.java.collection.hashset;

import java.util.LinkedHashSet;

/**
 * @author bhuwan
 *
 */
public class LinkedHashSetDemo {

    /**
     * 
     * In this case:
     * 
     * 1. duplicates are not allowed.
     * 
     * 2. insertion order is preserved.
     * 
     * @param args
     */
    public static void main(String[] args) {

        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Bhuwan");
        set.add("Raju");
        set.add("Bipul");
        set.add(null);
        System.out.println(set.add("Suman"));
        // trying to add duplicate object
        System.out.println(set.add("Bhuwan"));
        System.out.println("Printing set collection object: " + set);
    }

}
