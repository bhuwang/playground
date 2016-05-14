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
public class StringNaturalOrderDesc implements Comparator<String> {

    /**
     * @param args
     */
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>(new StringNaturalOrderDesc());
        names.add("Bhuwan");
        names.add("Bipen");
        names.add("Raju");
        names.add("Naresh");
        names.add("Achyut");
        names.add("Richan");
        names.add("Yaju");
        System.out.println(names);
    }

    @Override
    public int compare(String o1, String o2) {
        // return o1.compareTo(o2); // natural order

        // return o2.compareTo(o1); // reverse natural order

        return -o1.compareTo(o2); // reverse natural order
    }

}
