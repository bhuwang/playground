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
public class IntegerNaturalOrderDesc implements Comparator<Integer> {

    /**
     * @param args
     */
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>(new IntegerNaturalOrderDesc());
        numbers.add(10);
        numbers.add(0);
        numbers.add(13);
        numbers.add(122);
        numbers.add(45);
        numbers.add(3);
        numbers.add(3);
        numbers.add(3);
        numbers.add(3);
        System.out.println(numbers);
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        // you can just use the following one liner code
        // return o1.compareTo(o2); // natural asc order

        // return -o1.compareTo(o2); // natural desc order

        return o2.compareTo(o1); // natural desc order

        // or you can simply write the logic
        /*
         * if (o1 > o2) { return -1; } else if (o1 < o2) { return 1; } else { return 0; }
         */

        // for insertion order
        // return +1;

        // reverse of insertion order
        // return -1;

        // only first element will be displayed and other all by default considered as duplicate.
        // return 0;
    }

}
