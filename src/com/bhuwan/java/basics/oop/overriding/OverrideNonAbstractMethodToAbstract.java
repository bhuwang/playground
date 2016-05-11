/**
 * 
 */
package com.bhuwan.java.basics.oop.overriding;

/**
 * @author bhuwan
 *
 */
public abstract class OverrideNonAbstractMethodToAbstract extends NonAbstractMethodDemo {

    // we can override non abstract method as abstract method.
    @Override
    public abstract void m1();

}

class NonAbstractMethodDemo {

    public void m1() {

    }
}