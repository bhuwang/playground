/**
 * 
 */
package com.lftechnology.generics;

/**
 * @author bhuwan
 */
public class BoundedType {

    /**
     * Bounded type example
     * 
     * @author bhuwan
     * @param t1
     * @param t2
     * @return 0, 1, or -1
     */
    public static <T extends Comparable<T>> int compare(T t1, T t2) {
        return t1.compareTo(t2);
    }
    
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        String name = "Bhuwan";
        String anotherName = "Gautam";
        Double amount = 0.0;
        BoundedType.compare(name, anotherName);
    }

}
