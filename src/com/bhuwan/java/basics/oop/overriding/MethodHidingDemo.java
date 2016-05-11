/**
 * 
 */
package com.bhuwan.java.basics.oop.overriding;

/**
 * Demo for method hiding
 * 
 * See the result difference remove the static modifier in both overridden and overriding method.
 * 
 * In case of method hiding method resolution take place at compile time not run time unlike the behavior of overriding where method
 * resolution takes place at runtime.
 * 
 * @author bhuwan
 *
 */
public class MethodHidingDemo extends MethodHiding {

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        MethodHidingDemo child = new MethodHidingDemo();
        child.m1();

        MethodHiding parent = new MethodHiding();
        parent.m1();

        MethodHiding p1 = new MethodHidingDemo();
        p1.m1();
    }

    public static void m1() {
        System.out.println("Child method or method hiding method.");
    }

}

class MethodHiding {
    public static void m1() {
        System.out.println("Parent method or overriding method");
    }
}
