/**
 * 
 */
package com.bhuwan.java.basics.oop.overriding;

/**
 * @author bhuwan
 *
 */
public class OverrideStaticAsStatic extends StaticParentClass {

    // we can override static method as static again.
    // BTW this is not overriding, it is method hiding
    public static void m1() {
    }
}

class StaticParentClass {
    public static void m1() {

    }
}
