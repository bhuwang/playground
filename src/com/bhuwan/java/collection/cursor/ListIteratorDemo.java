/**
 * 
 */
package com.bhuwan.java.collection.cursor;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author bhuwan
 *
 */
public class ListIteratorDemo {

    /**
     * <pre>
     * {@link ListIterator} is only available for {@link List} Objects. It has following advantages:
     * 
     * 1. Forward and Backward Object and index Read capability.
     * 2. Replace
     * 3. Add
     * 4. Remove
     * </pre>
     * 
     * @param args
     */
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Bhuwan");
        names.add("Raju");
        names.add("Bipen");
        names.add("Achyut");
        names.add("Naresh");
        names.add("Pratik");
        names.add("Sohan");

        ListIterator<String> it = names.listIterator();
        System.out.println("Before: " + names);
        while (it.hasNext()) {
            String name = it.next();
            if (name.equals("Pratik")) {
                // Pratik will be removed.
                it.remove();
            } else if (name.equals("Sohan")) {
                // Sohan will be replaced by Sita
                it.set("Sita");
            } else if (name.equals("Bipen")) {
                // this will add Madhav after Bipen
                it.add("Madhav");
            }
        }
        System.out.println("...............................");
        System.out.println("After: " + names);
    }

}
