/**
 * 
 */
package com.bhuwan.java.basics.projecteuler;

/**
 * @author bhuwangautam
 *
 */
public class ReverseNumber {

    public static void main(String[] args) {
        int number = 123456789;
        StringBuilder result = new StringBuilder();

        while (number > 0) {
            int remainder = number % 10;
            result.append(remainder);
            number = number / 10;
        }
        System.out.println(result);
    }
}
