/**
 * 
 */
package com.bhuwan.java.collection.navigableset;

import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * @author bhuwan
 *
 */
public class NavigableSetDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<Integer>();
        // or
        // TreeSet<Integer> set = new TreeSet<>();

        set.add(1000);
        set.add(2000);
        set.add(5000);
        set.add(3000);
        set.add(4000);
        System.out.println("Original Set: " + set);
        System.out.println("ceiling of 2000: " + set.ceiling(2000));
        System.out.println("higher of 2000: " + set.higher(2000));
        System.out.println("floor of 3000: " + set.floor(3000));
        System.out.println("lower of 3000: " + set.lower(3000));
        System.out.println("Poll first: " + set.pollFirst());
        System.out.println("Poll last: " + set.pollLast());
        System.out.println("Descending set: " + set.descendingSet());
        System.out.println("Remaining original set: " + set);
    }

}
