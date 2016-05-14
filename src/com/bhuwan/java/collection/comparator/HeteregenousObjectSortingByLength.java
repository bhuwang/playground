/**
 * 
 */
package com.bhuwan.java.collection.comparator;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Program to sort for heterogeneous objects on the basis of the length. If the length is equal then consider alphabetical order [natural
 * order].
 * 
 * @author bhuwan
 *
 */
public class HeteregenousObjectSortingByLength implements Comparator<Object> {

    /**
     * @param args
     */
    public static void main(String[] args) {
        TreeSet<Object> names = new TreeSet<>(new HeteregenousObjectSortingByLength());
        names.add(new StringBuffer("Bhuwan"));
        names.add(new StringBuffer("Bipen"));
        names.add(new StringBuffer("Raju"));
        names.add(new StringBuffer("Naresh"));
        names.add(new StringBuffer("Achyut"));
        names.add(new StringBuffer("Richan"));
        names.add(new StringBuffer("Yaju"));
        names.add("Suman");
        names.add("Sampurna");
        names.add("Prashiddhi");
        System.out.println(names);
    }

    @Override
    public int compare(Object o1, Object o2) {
        if (o2.toString().length() > o1.toString().length()) {
            return +1;
        } else if (o2.toString().length() < o1.toString().length()) {
            return -1;
        } else {
            return o1.toString().compareTo(o2.toString());
        }
    }

}
