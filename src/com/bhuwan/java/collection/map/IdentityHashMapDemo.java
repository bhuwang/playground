/**
 * 
 */
package com.bhuwan.java.collection.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bhuwan
 *
 */
public class IdentityHashMapDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(new Integer(101), "Sudarshan Wagle");
        students.put(new Integer(102), "Utsukta Basnet");
        students.put(new Integer(103), "Prisha Gautam");
        students.put(new Integer(101), "Bhuwan Guatam");
        students.put(new Integer(102), "Suman Bhandari");
        students.put(new Integer(103), "Niraj Acharya");
        System.out.println();
        System.out.println(students);
    }

}
