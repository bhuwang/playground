/**
 * 
 */
package com.bhuwan.java.basics.operatorts;

/**
 * <pre>
 * IMPLICIT: compiler is responsible [widening/upcasting]
 * EXPLICIT: developer is responsible [Narrowing/downcasting]
 * </pre>
 * 
 * @author bhuwan
 *
 */
public class ImplicitAndExplicitTypeCasting {

    /**
     * @param args
     */
    public static void main(String[] args) {

        /*
         * IMPLICIT
         */
        double d = 10;
        System.out.println(d);

        int x = 'a';
        System.out.println(x);

        /*
         * EXPLICIT: there may be a chance of loss of information
         */
        byte b = (byte) 128;
        System.out.println(b);
    }

}
