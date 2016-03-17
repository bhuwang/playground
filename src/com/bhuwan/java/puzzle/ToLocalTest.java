/**
 * 
 */
package com.bhuwan.java.puzzle;

import java.util.Locale;

/**
 * @author bhuwan
 *
 */
public class ToLocalTest {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(new Locale("lt")); 
        String str = "\u00cc";
        System.out.println("Before case conversion is " + str + " and length is " + str.length());// Ì
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Lower case is " + lowerCaseStr + " and length is " + lowerCaseStr.length());// i?`
    }
}
