/**
 * 
 */
package com.bhuwan.java.basics.oop.constructor;

/**
 * <pre>
 * 
 * </pre>
 * 
 * @author bhuwan
 *
 */
public class ConstructorDemo {

    public ConstructorDemo() {
        System.out.println("First line should be super or this");
        // this(5);
    }

    public ConstructorDemo(int a) {
        // First line should be super() or this()
        System.out.println("Hello");
        // this("Bhuwan");
    }

    public ConstructorDemo(String a) {
        // if we have a recursive constructor call then we will have CTE
        this(10);
    }

    public ConstructorDemo(double a) {
        super();
        // this(10);
    }

    public static void main(String[] args) {

    }
}

abstract class AbstractClass {
    // Abstract class also can have constructor
    public AbstractClass() {
    }
}
