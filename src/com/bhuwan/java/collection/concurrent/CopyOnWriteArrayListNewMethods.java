/**
 * 
 */
package com.bhuwan.java.collection.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author bhuwan
 *
 */
public class CopyOnWriteArrayListNewMethods {

    /**
     * @param args
     */
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> cowal = new CopyOnWriteArrayList<>();
        cowal.add("Bhuwan");
        cowal.add("Madhav");
        cowal.add("Raju");
        cowal.add("Sunil");
        System.out.println("Original list:              " + cowal);

        // addIfAbsent() method
        cowal.addIfAbsent("Samrat");
        cowal.addIfAbsent("Bhuwan");
        System.out.println("After addIfAbsent() method: " + cowal);

        List<String> al = new ArrayList<>();
        al.add("Bhuwan");
        al.add("Jeevan");
        System.out.println();
        System.out.println("ArrayList original:           " + al);
        al.addAll(cowal);
        System.out.println("Joining members:              " + cowal);
        System.out.println("ArrayList after addAllMethod: " + al);

        System.out.println();
        System.out.println("COWL original:                            " + cowal);
        System.out.println("Joining members:                          " + al);
        // only the not present members are going to add to the original COWL list.
        cowal.addAllAbsent(al);
        System.out.println("COWL after running addAllAbsent method:   " + cowal);
    }

}
