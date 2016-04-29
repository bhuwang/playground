/**
 * 
 */
package com.bhuwan.java.basics.innerclasses;

/**
 * @author bhuwan
 *
 */
public class AccessingInnerClassMethodDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        AccessingInnerClassMethodDemo outer = new AccessingInnerClassMethodDemo();
        AccessingInnerClassMethodDemo.Inner inner = outer.new Inner();
        inner.m1();
        
        // or
        AccessingInnerClassMethodDemo.Inner in = new AccessingInnerClassMethodDemo().new Inner();
        in.m1();
        
        // or
        new AccessingInnerClassMethodDemo().new Inner().m1();
    }
 
    class Inner {
        public void m1() {
            System.out.println("Inner class method.");
        }
    }

}
