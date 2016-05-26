/**
 * 
 */
package com.bhuwan.java.basics.autoboxing;

/**
 * @author bhuwan
 *
 */
public class AutoBoxingOverloadingVsWideningDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int x = 10;
        m1(x);
    }

    // in java widening -> auto boxing not possible
    // Long l = 12;

    public static void m1(Integer i) {
        System.out.println("Overloading method");
    }

    public static void m1(int... i) {
        System.out.println("varg args method");
    }

    public static void m1(long l) {
        System.out.println("Widening type casting");
    }
}
