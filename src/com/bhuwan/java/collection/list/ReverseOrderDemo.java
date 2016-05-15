/**
 * 
 */
package com.bhuwan.java.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author bhuwan
 *
 */
public class ReverseOrderDemo {

    /**
     * In Collections there are two methods: reverse(list), and reverseOrder()
     * 
     * reverse: to reverse order of the original elements of list.
     * 
     * reverseOrder(): to get reverse comparator
     * 
     * Comparator reverseComparator = Collections.reverseOrder(Comparator orderComparator)
     * 
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
        Collections.reverse(list);

        System.out.println();
        System.out.println("reverse list: " + list);
    }

}