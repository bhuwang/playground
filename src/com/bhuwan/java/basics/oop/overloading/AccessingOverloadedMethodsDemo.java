/**
 * 
 */
package com.bhuwan.java.basics.oop.overloading;

/**
 * @author bhuwan
 *
 */
public class AccessingOverloadedMethodsDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // accessing overloaded methods.
        m1(3);
        m1(2.3f);
        // it is also possible
        m1('a');

        // accessing String and Objects overloaded method.
        m1("Bhuwan");
        m1(new Object());
        // this is eligible for both String and Object argument but always child will get the chance.
        // m1(null);

        m1(new StringBuffer());

        m1(10, 2.2f);
        m1(2.2f, 10);
        // m1(2, 2);
        // m1(2.2f, 2.2f);
    }

    public static void m1(int a) {
        System.out.println("inside int");
    }

    public static void m1(float a) {
        System.out.println("inside float");
    }

    public static void m1(String a) {
        System.out.println("inside String");
    }

    public static void m1(Object a) {
        System.out.println("inside Object");
    }

    public static void m1(StringBuffer a) {
        System.out.println("inside StringBuffer");
    }

    public static void m1(int a, float b) {
        System.out.println("inside int a, float b");
    }

    public static void m1(float a, int b) {
        System.out.println("inside float a, int b");
    }

}
