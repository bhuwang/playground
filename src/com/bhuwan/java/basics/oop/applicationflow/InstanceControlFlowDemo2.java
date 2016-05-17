/**
 * 
 */
package com.bhuwan.java.basics.oop.applicationflow;

/**
 * Static control flow is one time activity which will be performed at the time of class loading. But instance control flow is not one time
 * activity and it will be performed for every object creation. Object creating is the most costly operation if there is no specific
 * requirement then it is not recommended to create object.
 * 
 * <pre>
 * Execution of Instance control flow: 
 * 1. Identification of instance members from parent to child.
 * 2. Execution of instance variable assignments and instance blocks only in parent class.
 * 3. Execution of parent constructor.
 * 4. Execution of instance variable assignments and instance blocks in child class.
 * 5. Execution of child constructor
 * 
 * O/P:
 * 0
 * First instance block
 * Second instance block
 * Constructor called
 * Main method
 * </pre>
 * 
 * @author bhuwan
 *
 */
public class InstanceControlFlowDemo2 {

    int i = 0;

    {
        m1();
        System.out.println("First instance block");
    }

    public InstanceControlFlowDemo2() {
        System.out.println("Constructor called");
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        InstanceControlFlowDemo2 demo = new InstanceControlFlowDemo2();
        System.out.println("Main method");
    }

    public void m1() {
        System.out.println(j);
    }

    {
        System.out.println("Second instance block");
    }

    int j = 20;
}
