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

        // accessing outside static nested inner class
        OutsideStaticNested.Nested nest = new OutsideStaticNested.Nested();
        nest.m1();

    }

}

class OutsideStaticNested {
    static class Nested {
        public void m1() {
            System.out.println("Outside static inner class demo.");
        }
    }
}