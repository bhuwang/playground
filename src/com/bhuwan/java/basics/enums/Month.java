/**
 * 
 */
package com.bhuwan.java.basics.enums;

/**
 * Semicolon is mandatory if you are declaring extra method or variables other than constants.
 * 
 * Be aware of the order. if you are declaring extra method or variables inside enum class then constants should be first to be declare.
 * 
 * You cannot only declare method or variables without declaring enum constants in the first line of enum class.
 * 
 * @author bhuwan
 *
 */
public enum Month {
    JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEPT, OCT, NOV, DEC;

    // enum class also support methods and internal variables.
    public static void main(String[] args) {
        System.out.println("main method.........");
    }
}