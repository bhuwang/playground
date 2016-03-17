/**
 * 
 */
package com.bhuwan.java.puzzle;

/**
 * @author bhuwan
 *
 */
public class SwapTwoNumbers {

    public static void main(String[] args) {
        
        // Swap two number using Bitwise XOR ^
        int a = 5;
        int b = 4;
        System.out.println("before swapping values a: " + a + " b: " + b);
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;

        System.out.println("before swapping values a: " + a + " b: " + b);
    }
}
