/**
 * 
 */
package com.bhuwan.java.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <pre>
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
 * </pre>
 * 
 * @author bhuwan
 *
 */
public class BinarySearchDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Z");
        list.add("A");
        list.add("M");
        list.add("K");
        list.add("a");
        System.out.println("original list: " + list);
        // you can try search without sorting, you will get unexpected result.
        Collections.sort(list);
        System.out.println("Sorted List: " + list);
        System.out.println();
        System.out.println("Search result for searching 'Z' ");
        System.out.println(Collections.binarySearch(list, "Z"));
        System.out.println();
        System.out.println("Search result for searching 'J' ");
        System.out.println(Collections.binarySearch(list, "J"));
    }

}
