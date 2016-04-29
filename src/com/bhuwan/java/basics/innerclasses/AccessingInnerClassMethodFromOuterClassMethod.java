/**
 * 
 */
package com.bhuwan.java.basics.innerclasses;

/**
 * @author bhuwan
 *
 */
public class AccessingInnerClassMethodFromOuterClassMethod {

    /**
     * @param args
     */
    public static void main(String[] args) {
        new AccessingInnerClassMethodFromOuterClassMethod().out();
    }

    public void out() {
        System.out.println("Outer class method.");

        // accessing inner class object from outer class method is a lot more easier way
        // since the outer class object is already created in main we don't need to recreat it again.
        new Inner().in();
    }

    class Inner {
        public void in() {
            System.out.println("Inner class method.");
        }
    }

}
