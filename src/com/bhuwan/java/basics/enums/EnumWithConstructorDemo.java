/**
 * 
 */
package com.bhuwan.java.basics.enums;

/**
 * @author bhuwan
 *
 */
public class EnumWithConstructorDemo {

    public static void main(String[] args) {
        Alphabets a = Alphabets.A;
        System.out.println("main method executed. "+a);
    }
}

enum Alphabets {
    A, B, C, D;

    Alphabets() {
        System.out.println("Constructor method executed.");
    }
}
