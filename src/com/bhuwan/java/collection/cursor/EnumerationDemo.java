/**
 * 
 */
package com.bhuwan.java.collection.cursor;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * Enumeration only works with legacy classes [Vector, Stack etc]. It is not available for other collection classes. It does not have remove
 * method.
 * 
 * Here the legacy classes means the classes which were introduced in java version 1.0
 * 
 * @author bhuwan
 *
 */
public class EnumerationDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        for (int i = 0; i <= 10; i++) {
            vector.add(i);
        }
        System.out.println("Initial Vector: " + vector);

        // Using Enumeration
        Enumeration<Integer> elements = vector.elements();
        while (elements.hasMoreElements()) {
            Integer num = elements.nextElement();
            if (num % 2 == 0) {
                System.out.println(num);
            } else {
                // enumeration does not have remove method.
                // elements.remove();
            }
        }
        System.out.println("After Operation using enumeration - Vector: " + vector);

        Iterator<Integer> it = vector.iterator();
        while (it.hasNext()) {
            Integer num = it.next();
            if (num % 2 == 0) {
                System.out.println(num);
            } else {
                it.remove();
            }
        }
        System.out.println("After Operation using iterator - List: " + vector);
    }

}
