/**
 * 
 */
package com.bhuwan.java.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * In case of binary search following rules should apply. Otherwise you will get unexpected error.
 * 
 * 1. List should be sorted either by default order or by using custom comparator
 * 
 * 2. binarySearch method returns index on successful search. Index start from 0,1,2,3........
 * 
 * 3. binarySearch method returns insertion index on unsuccessful search. Insertion index start from -1,-2,-3,-4........
 * 
 * 4. Same comparator should be used if the list is sorted by using custom comparator, otherwise you will get unexpected result.
 * 
 * for the list of 'n' elements,
 * 
 * 1. successful result range: 0 to n-1
 * 
 * 2. unsuccessful result range: -(n+1) to -1
 * 
 * 3. total result range: -(n+1) to n-1
 * 
 * 
 * @author bhuwan
 *
 */
public class BinarySearchCustomComparatorDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(0);
        list.add(20);
        list.add(10);
        list.add(5);
        System.out.println("original list: " + list);
        // you can try search without sorting, you will get unexpected result.
        Collections.sort(list, new BinaryCustomComparator());
        System.out.println("Sorted List: " + list);
        System.out.println();
        System.out.println("Search result for searching 10 ");
        System.out.println(Collections.binarySearch(list, 10, new BinaryCustomComparator()));

        System.out.println();
        System.out.println("Search result for searching 13 ");
        // if you do not provide the correct comparator then you will get the unexpected result.
        System.out.println(Collections.binarySearch(list, 13, new BinaryCustomComparator()));

        System.out.println();
        System.out.println("Search result for searching 17 ");
        // if you do not provide the correct comparator then you will get the unexpected result.
        System.out.println(Collections.binarySearch(list, 17, new BinaryCustomComparator()));
    }

}

class BinaryCustomComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
    }

}
