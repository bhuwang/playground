/**
 * 
 */
package com.bhuwan.java.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author bhuwan
 *
 */
public class HashMapDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<Integer, String>();
        System.out.println(students.put(109, "Sudarshan Wagle"));
        System.out.println(students.put(111, "Utsukta Basnet"));
        System.out.println(students.put(117, "Prisha Gautam"));
        System.out.println(students.put(101, "Bhuwan Guatam"));
        System.out.println(students.put(102, "Suman Bhandari"));
        // Since Bhuwan Gautam is going to replace with Kiran Gautam, put returns the old value.
        System.out.println(students.put(101, "Kiran Guatam"));
        System.out.println(students.put(103, "Niraj Acharya"));
        System.out.println();
        System.out.println(students);

        // get only keys
        System.out.println();
        Set<Integer> keySet = students.keySet();
        System.out.println(keySet);

        // get only values
        System.out.println();
        Collection<String> values = students.values();
        System.out.println(values);

        // get entry set
        System.out.println();
        Set<Entry<Integer, String>> entrySet = students.entrySet();
        System.out.println(entrySet);

        // iterate entry set
        System.out.println();
        Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Entry<Integer, String> next = iterator.next();
            if (next.getKey() == 101) {
                next.setValue("Bhuwaneshwor Gautam");
            }
            System.out.println(next.getKey() + " : " + next.getValue());
        }
    }

}
