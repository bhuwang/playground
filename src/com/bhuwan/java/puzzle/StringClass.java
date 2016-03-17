/**
 * 
 */
package com.bhuwan.java.puzzle;

/**
 * @author bhuwan
 *
 */
public class StringClass {
    /**
     * <pre>
     * Problem:
     * We do not have a main method with the expected signature. “main” method should have a String array as argument, but in our code the
     * String array is compiled to be our custom String class and not the “java.lang.String” class. Therefore we get the error as main
     * method missing.
     * 
     * Solution:
     * Do not declare your custom classes in the name of classes from the standard package. It will result in unexpected behavior.
     * </pre>
     * 
     * @param args
     */
    public static void main(String[] args) {
        // use the line below to fix the issue
        // public static void main(java.lang.String[] args) {
        int a = 10 + 20;
        System.out.println(a);
    }
}

class String1 {
    @SuppressWarnings("unused")
    private final String str;

    public String1(String str) {
        this.str = str;
    }
}
