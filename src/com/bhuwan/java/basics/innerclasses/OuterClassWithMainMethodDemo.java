/**
 * 
 */
package com.bhuwan.java.basics.innerclasses;

/**
 * @author bhuwan
 *
 */
public class OuterClassWithMainMethodDemo {

    /**
     * Inner class name syntax: Inner$Outer
     * 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Outer class main method.");
    }

    class Inner {
        // you cannot declare static method/variable inside inner class
        // if you do you will get compile time error.
    }

}
