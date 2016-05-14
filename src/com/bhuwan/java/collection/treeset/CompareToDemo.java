/**
 * 
 */
package com.bhuwan.java.collection.treeset;

/**
 * @author bhuwan
 *
 */
public class CompareToDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String name = "Bhuwan";
        String name1 = "Chris";
        String sameName = "Bhuwan";
        System.out.println("Different name compare: " + name.compareTo(name1));
        System.out.println("Different name compare 1: " + name1.compareTo(name));
        System.out.println("Same name compare: " + name.compareTo(sameName));

        // for integers
        Integer num1 = 12;
        Integer num2 = 15;
        Integer num = 12;
        System.out.println("Different compare: " + num1.compareTo(num2));
        System.out.println("Different compare 1: " + num2.compareTo(num1));
        System.out.println("Same compare: " + num1.compareTo(num));
    }

}
