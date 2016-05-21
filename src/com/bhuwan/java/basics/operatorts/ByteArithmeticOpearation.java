/**
 * 
 */
package com.bhuwan.java.basics.operatorts;

/**
 * <pre>
 * JAVA Arithmetic Operation Rule:
 * 
 * max(int, type of a, type of b)
 * 
 * </pre>
 * 
 * @author bhuwan
 *
 */
public class ByteArithmeticOpearation {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // difference between byte b = b++ vs byte b = b+1;
        byte bb = 20;
        bb++;
        System.out.println("increment: " + bb);
        // this is not possible.
        // bb = bb + 1;

        byte b = 10;
        byte c = 11;
        byte a = (byte) (b + c);
        System.out.println("sum: " + a);
    }

}
