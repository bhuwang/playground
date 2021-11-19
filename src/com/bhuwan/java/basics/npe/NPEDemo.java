/**
 * 
 */
package com.bhuwan.java.basics.npe;

/**
 * @author bhuwan
 */
public class NPEDemo {
    public static void main(String[] args) {
        Boolean object = null;
        // In case of boolean it will not show any compile time issue. but will
        // throw NPE at run time.
        if (object = null) {
            System.out.println("Object: " + object);// this will work
        }
        // in this case compiler will catch the issue at compile time
        // if (null = object) {
        // System.out.println("Object2: " + object);
        // }
        String object1 = null;
        // Same will not work other than boolean object.
        /*
         * if (object1 = null) {
         * 
         * }
         */

    }

    public void displayName() {

    }

}
