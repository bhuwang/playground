/**
 * 
 */
package com.bhuwan.java.collection.navigablemap;

import java.util.TreeMap;

/**
 * @author bhuwan
 *
 */
public class NavigableMapDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // NavigableMap<String, String> map = new TreeMap<>();
        // or
        TreeMap<String, String> map = new TreeMap<>();

        map.put("b", "banana");
        map.put("c", "cat");
        map.put("a", "apple");
        map.put("d", "dog");
        map.put("g", "gun");
        map.put("e", "eagle");
        System.out.println("Original map: " + map);
        System.out.println("ceiling of c: " + map.ceilingKey("c"));
        System.out.println("higher of c: " + map.higherKey("c"));
        System.out.println("floor of e: " + map.floorKey("e"));
        System.out.println("lower of e: " + map.lowerKey("e"));
        System.out.println("Poll first: " + map.pollFirstEntry());
        System.out.println("Poll last: " + map.pollLastEntry());
        System.out.println("Descending map: " + map.descendingMap());
        System.out.println("Remaining original set: " + map);
    }

}
