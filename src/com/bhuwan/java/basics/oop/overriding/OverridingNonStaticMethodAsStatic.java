/**
 * 
 */
package com.bhuwan.java.basics.oop.overriding;

/**
 * @author bhuwan
 *
 */
public class OverridingNonStaticMethodAsStatic extends NonStaticClass {

    // we cann't override non static method as static.
    /*@Override
    public static void m1() {
    }*/
}

class NonStaticClass {
    public void m1() {

    }
}