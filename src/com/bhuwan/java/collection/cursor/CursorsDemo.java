/**
 * 
 */
package com.bhuwan.java.collection.cursor;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

/**
 * @author bhuwan
 *
 */
public class CursorsDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        Iterator<Integer> it = v.iterator();
        Enumeration<Integer> enu = v.elements();
        ListIterator<Integer> lit = v.listIterator();
        System.out.println("Iterator: " + it.getClass().getName());
        System.out.println("Enumeration: " + enu.getClass().getName());
        System.out.println("List Iterator: " + lit.getClass().getName());

        System.out.println();
        List<Integer> list = new ArrayList<>();
        it = list.iterator();
        // enumeration not available for ArrayList because it is only for legacy classes.
        // enu = list.elements();
        lit = list.listIterator();
        System.out.println("Iterator: " + it.getClass().getName());
        System.out.println("List Iterator: " + lit.getClass().getName());

        System.out.println();
        List<Integer> linkedList = new LinkedList<>();
        it = linkedList.iterator();
        // enumeration not available for ArrayList because it is only for legacy classes.
        // enu = list.elements();
        lit = linkedList.listIterator();
        System.out.println("Iterator: " + it.getClass().getName());
        System.out.println("List Iterator: " + lit.getClass().getName());
    }

}
