/**
 * 
 */
package com.bhuwan.java.collection.map;

import java.util.Properties;

/**
 * @author bhuwan
 *
 */
public class PropertiesFileOverlap {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Properties properties1 = new Properties();
        Properties properties2 = new Properties();

        properties1.put("A", "Apple");
        properties1.put("B", "Ball");

        properties2.put("A", "Apple");
        properties2.put("C", "Cat");

    }

}
