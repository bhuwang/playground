/**
 * 
 */
package com.bhuwan.java.basics.array;

import java.util.Arrays;
import java.util.Comparator;

import com.bhuwan.java.collection.list.BinarySearchDemo;

/**
 * All the rules are same as Collections.binarySearch() method. Please see {@link BinarySearchDemo} documentation for detail.
 * 
 * @author bhuwan
 *
 */
public class SearchingArray {

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        int a[] = { 10, 5, 20, 11, 6 };
        System.out.println("Original array: ");
        for (int b : a) {
            System.out.print(b + " ");
        }

        Arrays.sort(a);
        System.out.println();
        System.out.println();
        System.out.println("After sorting: ");
        for (int b : a) {
            System.out.print(b + " ");
        }
        System.out.println();
        System.out.println("Search for element 6: " + Arrays.binarySearch(a, 6));
        System.out.println("Search for element 14: " + Arrays.binarySearch(a, 14));

        System.out.println();
        System.out.println();
        String aa[] = { "Bhuwan", "Suman", "Richan", "Santosh", "Krishna" };
        System.out.println("Original array: ");
        for (String b : aa) {
            System.out.print(b + " ");
        }

        Arrays.sort(aa);
        System.out.println();
        System.out.println();
        System.out.println("After default sorting: ");
        for (String b : aa) {
            System.out.print(b + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Search for element Richan: " + Arrays.binarySearch(aa, "Richan"));
        System.out.println("Search for element Kailash: " + Arrays.binarySearch(aa, "Kailash"));

        Arrays.sort(aa, new ArraySearchCustomComparator());
        System.out.println();
        System.out.println();
        System.out.println("After reverse natural order sorting: ");
        for (String b : aa) {
            System.out.print(b + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Search for element Richan: " + Arrays.binarySearch(aa, "Richan", new ArraySearchCustomComparator()));
        System.out.println("Search for element Kailash: " + Arrays.binarySearch(aa, "Kailash", new ArraySearchCustomComparator()));
    }
}

class ArraySearchCustomComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }

}
