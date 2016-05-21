/**
 * 
 */
package com.bhuwan.java.basics.operatorts;

/**
 * '+' is the only overloaded operator in JAVA.
 * 
 * @author bhuwan
 *
 */
public class StringConcatenationDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        String d = "Bhuwan";
        System.out.println(a + b + c);
        System.out.println(a + b + c + d);
        System.out.println(d + a + b + c);
        System.out.println(a + b + d + c);
    }

}
