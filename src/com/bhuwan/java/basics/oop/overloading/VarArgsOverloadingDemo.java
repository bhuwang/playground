/**
 * 
 */
package com.bhuwan.java.basics.oop.overloading;

/**
 * @author bhuwan
 *
 */
public class VarArgsOverloadingDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        m1();
        m1(10, 20);
        m1(2);
    }

    public static void m1(int a) {
        System.out.println("inside int");
    }

    public static void m1(int... a) {
        System.out.println("inside int var args");
    }
}
