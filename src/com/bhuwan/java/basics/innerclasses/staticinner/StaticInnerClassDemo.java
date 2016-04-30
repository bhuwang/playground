/**
 * 
 */
package com.bhuwan.java.basics.innerclasses.staticinner;

/**
 * @author bhuwan
 *
 */
public class StaticInnerClassDemo {

    static class Nested {
        public void m1() {
            System.out.println("Static inner class");
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.m1();
    }

}