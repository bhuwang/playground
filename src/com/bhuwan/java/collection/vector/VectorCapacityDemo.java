/**
 * 
 */
package com.bhuwan.java.collection.vector;

import java.util.Vector;

/**
 * @author bhuwan
 *
 */
public class VectorCapacityDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        System.out.println("Initail Capacity: " + v.capacity());
        
        for (int i = 1; i <= 12; i++) {
            v.add(i);
        }
        System.out.println();
        System.out.println("Vector: " + v);
        System.out.println("Size: " + v.size());
        System.out.println("Capacity: " + v.capacity());
        
        for (int i = 1; i <= 10; i++) {
            v.add(i);
        }
        System.out.println();
        System.out.println("Vector: " + v);
        System.out.println("Size: " + v.size());
        System.out.println("Capacity: " + v.capacity());
        
        for (int i = 1; i <= 20; i++) {
            v.add(i);
        }
        System.out.println();
        System.out.println("Vector: " + v);
        System.out.println("Size: " + v.size());
        System.out.println("Capacity: " + v.capacity());
    }

}
