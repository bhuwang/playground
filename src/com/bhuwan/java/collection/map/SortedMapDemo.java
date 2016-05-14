/**
 * 
 */
package com.bhuwan.java.collection.map;

import java.util.TreeMap;

/**
 * @author bhuwan
 *
 */
public class SortedMapDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        TreeMap<Integer, String> students = new TreeMap<>();
        students.put(109, "Sudarshan Wagle");
        students.put(111, "Utsukta Basnet");
        students.put(117, "Prisha Gautam");
        students.put(101, "Bhuwan Guatam");
        students.put(102, "Suman Bhandari");
        students.put(101, "Sudarshan Wagle");
        students.put(102, "Utsukta Basnet");
        students.put(103, "Prisha Gautam");
        students.put(101, "Bhuwan Guatam");
        students.put(102, "Suman Bhandari");
        students.put(103, "Niraj Acharya");
        System.out.println();
        System.out.println(students);
        System.out.println("First Entry: " + students.firstEntry());
        System.out.println("Last Entry: " + students.lastEntry());
        System.out.println("Head Map of 109: " + students.headMap(109));
        System.out.println("Tail Map of 109: " + students.tailMap(109));
        System.out.println("Sub Map from 103 to 111: " + students.subMap(103, 111));
        System.out.println(students.comparator());
    }

}
