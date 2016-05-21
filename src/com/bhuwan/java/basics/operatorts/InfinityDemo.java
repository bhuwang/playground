/**
 * 
 */
package com.bhuwan.java.basics.operatorts;

/**
 * @author bhuwan
 *
 */
public class InfinityDemo {

    /**
     * Integral Arithmetic: There is no support of INFINITY | NaN
     * 
     * Floating Point Arithmetic: There is a support INFINITY | NaN
     * 
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Floating Point Arithmetic INFINITY:");
        System.out.println("o/p: " + 1.0 / 0.0);

        System.out.println();
        System.out.println("Integral Arithmetic INFINITY:");
        // System.out.println("o/p: " + 1 / 0);

        System.out.println("Floating Point Arithmetic NaN:");
        System.out.println("o/p: " + 0.0 / 0.0);

        System.out.println();
        System.out.println("Integral Arithmetic NaN:");
        // System.out.println("o/p: " + 0 / 0);
    }

}
