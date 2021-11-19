/**
 * 
 */
package com.bhuwan.java.basics.interview;

/**
 * @author bhuwangautam
 *
 */
public class StringReverse {

    public static void main(String[] args) {
        System.out.println(StringReverse.usingStringReverseMethod("Bhuwan"));
        System.out.println(StringReverse.usingSubString("Gautam"));
        System.out.println(StringReverse.usingCharAt("YuvanS"));
    }

    private static String usingStringReverseMethod(String value) {
        return new StringBuilder(value).reverse().toString();
    }

    private static String usingSubString(String value) {
        StringBuilder reverseString = new StringBuilder();
        for (int i = 0; i < value.length(); i++) {
            reverseString.append(value.substring(value.length() - (i + 1), value.length() - i));
        }

        return reverseString.toString();
    }

    private static String usingCharAt(String value) {
        StringBuilder reverseString = new StringBuilder();
        for (int i = 1; i <= value.length(); i++) {
            reverseString.append(value.charAt(value.length() - i));
        }
        return reverseString.toString();
    }
}
