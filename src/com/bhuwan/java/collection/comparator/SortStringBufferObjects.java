/**
 * 
 */
package com.bhuwan.java.collection.comparator;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author bhuwan
 *
 */
public class SortStringBufferObjects implements Comparator<Object> {

    /**
     * @param args
     */
    public static void main(String[] args) {
        TreeSet<StringBuffer> names = new TreeSet<>(new SortStringBufferObjects());
        names.add(new StringBuffer("Bhuwan"));
        names.add(new StringBuffer("Bipen"));
        names.add(new StringBuffer("Raju"));
        names.add(new StringBuffer("Naresh"));
        names.add(new StringBuffer("Achyut"));
        names.add(new StringBuffer("Richan"));
        names.add(new StringBuffer("Yaju"));
        System.out.println(names);
    }

    @Override
    public int compare(Object o1, Object o2) {
        // return o1.compareTo(o2); // natural order

        // return o2.compareTo(o1); // reverse natural order

        return -o1.toString().compareTo(o2.toString()); // reverse natural order
    }

}
