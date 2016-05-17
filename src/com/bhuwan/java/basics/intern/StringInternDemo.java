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
     * @param args
     */
    public static void main(String[] args) {
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
