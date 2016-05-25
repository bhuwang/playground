/**
 * 
 */
package com.bhuwan.java.basics.stringbuffer;

/**
 * <pre>
 * String Buffer Capacity Formula:
 * 
 * CurrentCapacity = 16
 * NewCapacity = (CurrentCapacity + 1) * 2
 * 
 * Sequence: 16, 34, 70, 142, ...
 * </pre>
 * 
 * @author bhuwan
 *
 */
public class CapacityDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        StringBuffer n = new StringBuffer();
        // n.append("abcdefghijklmnop");
        // n.append("q");
        // n.append("abcdefghijklmnop");
        // n.append("q");
        // n.append("r");
        System.out.println("Initial Capacity: " + n.capacity());

        // capacity = String.length() + initial capacity (16)
        n = new StringBuffer("Bhuwan");
        // n.append("abcdefghijklmnop");
        // n.append("q");
        // n.append("abcdefghijklmnop");
        // n.append("q");
        // n.append("r");
        System.out.println("Initial Capacity: " + n.capacity());
    }

}
