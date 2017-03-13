/**
 * 
 */
package com.bhuwan.java.collection;

import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * <pre>
 * The returned set is backed by this set, so changes in the returned set are reflected in the set, and vice-versa.
 *         
 * {@link TreeSet}
 *      headSet
 *      subSet
 *      tailSet
 * {@link TreeMap}
 *      headMap
 *      subMap
 *      tailMap
 * </pre>
 * 
 * @author bhuwan
 */
public class BackedCollectionsDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>();
        map.put("a", "Hundai");
        map.put("d", "Ford");
        map.put("h", "Ferari");

        SortedMap<String, String> submap = map.subMap("b", "g");

        System.out.println("map: " + map.toString());
        System.out.println("submap: " + submap.toString());

        // changes made to map and submap reflect to each other.
        map.put("b", "BMW");
        submap.put("f", "Suzuki");

        map.put("r", "Rover");
        // java.lang.IllegalArgumentException: key out of range
        // submap.put("p", "Fiat");

        System.out.println("map: " + map.toString());
        System.out.println("submap: " + submap.toString());

    }

}
