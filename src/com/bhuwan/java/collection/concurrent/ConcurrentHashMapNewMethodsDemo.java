/**
 * 
 */
package com.bhuwan.java.collection.concurrent;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author bhuwan
 *
 */
public class ConcurrentHashMapNewMethodsDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Map<Integer, String> map = new ConcurrentHashMap<>();
        map.put(103, "Suman Bhandari");
        map.put(101, "Bhuwan Gautam");
        map.put(102, "Richan Shrestha");
        // checks if the key 104 present or not. If not present add otherwise do nothing.
        map.putIfAbsent(104, "Sachin Shrestha");
        map.putIfAbsent(102, "Sarita Nepal");
        System.out.println("Original Map: " + map);

        // remove(Object key, Object value) method removes if the key and value both matched otherwise do nothing.
        // key matched but value not matched. Hence, do nothing.
        map.remove(101, "Prisha Gautam");
        // key and value both matched. Hence, remove.
        map.remove(104, "Sachin Shrestha");
        System.out.println("After doing remove operation: " + map);

        // replace(Object key, Object oldValue, Object newValue) method replace with new value if the key and value both matched otherwise
        // do nothing.
        // key matched but value not matched. Hence, do nothing.
        map.replace(101, "Prisha Gautam", "Pratiksha Wagle");
        // key and value both matched. Hence, remove.
        map.replace(103, "Suman Bhandari", "Pritanshi Pandit");
        System.out.println("After doing replace operation: " + map);
    }

}
