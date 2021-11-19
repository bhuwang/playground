/**
 * 
 */
package com.bhuwan.java.basics.projecteuler;

/**
 * @author bhuwangautam
 *
 */
public class ReverseString {

    public static void main(String[] args) {
        String value = "1234567";
        StringBuilder result = new StringBuilder();
        for (int i = value.length() - 1; i >= 0; i--) {
            result.append(value.charAt(i));
        }
        System.out.println(result);
    }
}
