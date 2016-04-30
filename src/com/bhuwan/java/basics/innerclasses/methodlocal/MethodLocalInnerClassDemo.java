/**
 * 
 */
package com.bhuwan.java.basics.innerclasses.methodlocal;

/**
 * @author bhuwan
 *
 */
public class MethodLocalInnerClassDemo {

    public void m1() {
        /*
         * You cannot define method inside method ie. nested methods are not allowed.
         * 
         * Then main purpose of Method local inner class: when we require method specific repeatedly require functionalities.
         */
        class Inner {
            public void sum(int a, int b) {
                System.out.println("sum: " + a + b);
            }
        }
        Inner i = new Inner();
        i.sum(3, 4);

        i.sum(12, 13);

        i.sum(23, 12);

    }

    public static void main(String[] args) {
        MethodLocalInnerClassDemo demo = new MethodLocalInnerClassDemo();
        demo.m1();
    }

}
