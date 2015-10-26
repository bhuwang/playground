/**
 * 
 */
package com.bhuwan.java.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author bhuwan
 */
public class IteratorVsForLoop {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Bhuwan");
        set.add("Hari");
        set.add("Krishna");

        /*Iterator<String> setIterator = set.iterator();
        while (setIterator.hasNext()) {
            String name = setIterator.next();
            if (name.equals("Hari")) {
                setIterator.remove();
            }
        }*/
        for (String name : set) {
            if (name.equals("Hari")) {
                set.remove(name);
            }
            System.out.println("Name:: " + name);
        }

    }
}
