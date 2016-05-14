/**
 * 
 */
package com.bhuwan.java.collection.treeset;

import java.util.TreeSet;

/**
 * @author bhuwan
 *
 */
public class TreeSetDemoWithStringBuffer {

    /**
     * In this case we will get ClassCastException because StringBuffer does not implement Comparable interface.
     * 
     * @param args
     */
    public static void main(String[] args) {

        TreeSet<StringBuffer> alphabets = new TreeSet<>();
        alphabets.add(new StringBuffer("A"));
        alphabets.add(new StringBuffer("G"));
        alphabets.add(new StringBuffer("H"));
        alphabets.add(new StringBuffer("E"));
        alphabets.add(new StringBuffer("R"));
        System.out.println("Treeset: " + alphabets);

    }

}
