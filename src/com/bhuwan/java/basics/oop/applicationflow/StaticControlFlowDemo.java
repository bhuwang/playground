/**
 * 
 */
package com.bhuwan.java.basics.oop.applicationflow;

/**
 * <pre>
 * Program Execution Flow:
 * 1. Identification of static members from parent to child.
 * 2. Execution of static variable assignment and static block from parent to child.
 * 3. Execution of only child class main method.
 * 
 * O/P: 
 * 0
 * Base static block
 * 0 
 * Derived class first static blcok 
 * Derived class second static block
 * 200
 * Derived class main
 * </pre>
 * 
 * @author bhuwan
 *
 */
public class StaticControlFlowDemo extends BaseStaticDemo {

    static int x = 100;

    static {
        m2();
        System.out.println("Derived class first static blcok");
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        m2();
        System.out.println("Derived class main");
    }

    public static void m2() {
        System.out.println(y);
    }

    static {
        System.out.println("Derived class second static block");
    }

    static int y = 200;

}

class BaseStaticDemo {
    static int i = 10;

    static {
        m1();
        System.out.println("Base static block");
    }

    public static void main(String[] args) {
        m1();
        System.out.println("Base main");
    }

    public static void m1() {
        System.out.println(j);
    }

    static int j = 20;

}
