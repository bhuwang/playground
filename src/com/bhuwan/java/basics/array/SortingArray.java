/**
 * 
 */
package com.bhuwan.java.basics.array;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author bhuwan
 *
 */
public class SortingArray {

    /**
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

        Arrays.sort(aa, new ArrayCustomComparator());
        System.out.println();
        System.out.println();
        System.out.println("After reverse natural order sorting: ");
        for (String b : aa) {
            System.out.print(b + " ");
        }
    }
}

class ArrayCustomComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }

}
