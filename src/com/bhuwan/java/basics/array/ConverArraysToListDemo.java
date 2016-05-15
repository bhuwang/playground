/**
 * 
 */
package com.bhuwan.java.basics.array;

import java.util.Arrays;
import java.util.List;

/**
 * Arrays.asList() method is used to view array as list.
 * 
 * Arrays.asList() method will not convert the array to list instead it is only a list view for array.
 * 
 * @author bhuwan
 *
 */
public class ConverArraysToListDemo {

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        Integer a[] = { 10, 5, 20, 11, 6 };
        System.out.println("Original array: ");
        // you can print array using loop
        for (int b : a) {
            System.out.print(b + " ");
        }

        // or you can print using Arrays.toString() method.
        System.out.println();
        System.out.println();
        System.out.println("Using toString() method: " + Arrays.toString(a));

        // convert array to list
        List<Integer> list = Arrays.asList(a);
        System.out.println(list);

        System.out.println();
        // Since both list and array both reference to the same object, changing to once will reflect in both sides.
        a[0] = 44;
        System.out.println("after altering 0 index value from 10 to 44: " + list);
        System.out.println("after altering 0 index value from 10 to 44: " + Arrays.toString(a));
        // Since array is of fixed size you cannot alter the size using list. If you do you will get UnsupportedOperationException.
        // list.add(56);
        // list.remove(10);

        // But you can replace the value.
        System.out.println();
        list.set(4, 66);
        System.out.println("after altering 4 index value from 6 to 66: " + Arrays.toString(a));
        System.out.println("after altering 4 index value from 6 to 66: " + list);

    }
}