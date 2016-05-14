/**
 * 
 */
package com.bhuwan.java.collection.hashset;

import java.util.HashSet;

/**
 * In this case:
 * 
 * 1. duplicates are not allowed.
 * 
 * 2. insertion order not preserved.
 * 
 * @author bhuwan
 *
 */
public class HashSetDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
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
