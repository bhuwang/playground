/**
 * 
 */
package com.bhuwan.java.collection.treeset;

import java.util.TreeSet;

/**
 * @author bhuwan
 *
 */
public class TreeSetDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        TreeSet<String> alphabets = new TreeSet<>();
        alphabets.add("A");
        alphabets.add("a");
        alphabets.add("B");
        alphabets.add("Z");
        alphabets.add("X");
        alphabets.add("M");
        alphabets.add("J");
        alphabets.add("k");

        // trying to insert duplicate objects. Since duplicated are not allowed it should return false.
        System.out.println(alphabets.add("A"));
        System.out.println(alphabets.add("a"));

        // in treeset heterogeneous objects are not allowed
        // alphabets.add(10);

        // Since tree set maintains the sorting order by default it is natural sorting order. If you try insert null then you will get NPE.
        // null is acceptable only for empty treeset.
        // alphabets.add(null);
        System.out.println("Treeset: " + alphabets);
    }

}
