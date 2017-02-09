/**
 *
 */
package com.bhuwan.java.basics.oop.applicationflow;

/**
 * Here all we have declared is instance blocks. Since we have not created any object then there is no chance of executing instance block.
 * Hence the output only be "Main method."
 *
 * @author bhuwan
 */
public class InstanceControlFlowDemo {

    int i = 0;

    {
        m1();
        System.out.println("First instance block");
    }

    public InstanceControlFlowDemo() {
        System.out.println("Constructor called");
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Main method.");
    }

    public void m1() {
        System.out.println(j);
    }

    {
        System.out.println("Second instance block");
    }

    int j = 20;
}
