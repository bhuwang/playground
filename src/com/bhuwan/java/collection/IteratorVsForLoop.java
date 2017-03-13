/**
 * 
 */
package com.bhuwan.java.collection;

import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author bhuwan
 * 
 * 
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

        Iterator<String> setIterator = set.iterator();
        while (setIterator.hasNext()) {
            String name = setIterator.next();
            if (name.equals("Hari")) {
                setIterator.remove();
                System.out.println("To be removed using iterator:: " + name);
            }
        }

        /**
         * In case of for loop while removing, you would get ConcurrentModificationException
         */
        for (String name : set) {
            if (name.equals("Krishna")) {
                try {
                    set.remove(name);
                } catch (ConcurrentModificationException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("To be removed using for loop:: " + name);
            }
        }

        System.out.println("Set: " + set.toString());

    }
}
