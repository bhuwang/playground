/**
 * 
 */
package com.bhuwan.java.basics.intern;

/**
 * @author bhuwan
 *
 */
public class StringInternDemo {

    /**
     * Without using new operator it is possible to create a object for the classes. Such type of classes objects we can called it as
     * first-class objects.
     * 
     * Whenever we create string literal first jvm goes to SCP (String constant pool) and check if the string is already present in the pool
     * or not. If it is available it returns the existing reference from the pool, if it is not available a new String object is created.
     * 
     * @param args
     */
    public static void main(String[] args) {
        // create first-class String object
        String n1 = "Bhuwan";
        String n2 = new String("Bhuwan");
        String n3 = "Bhuwan";

        if (n1 == n2) {
            System.out.println("n1==n2");
        }

        if (n1 == n2.intern()) {
            System.out.println("n1 and n2 values are same.");
        }

        if (n1 == n2) {
            System.out.println("n1 and n2 values are same.");
        }

        if (n1.equals(n2)) {
            System.out.println("..........n1 and n2 values are same.");
        }

        if (n1 == n3) {
            System.out.println("n1==n3");
        }
    }

}
