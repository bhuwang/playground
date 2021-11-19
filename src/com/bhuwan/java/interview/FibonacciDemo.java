/**
 * 
 */
package com.bhuwan.java.interview;

/**
 * @author bhuwangautam
 *
 */
public class FibonacciDemo {

    public static void main(String[] args) {
        fibonacci(100);
    }

    public static int fibonacci(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        int fibo = 1;
        int start = 0;
        int end = 1;
        while (fibo <= number) {
            fibo = start + end;
            start = end;
            end = fibo;
        }
        return fibo;
    }
}
