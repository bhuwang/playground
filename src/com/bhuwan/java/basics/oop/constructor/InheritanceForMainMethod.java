/**
 * 
 */
package com.bhuwan.java.basics.oop.constructor;

/**
 * If the child class does not contain main() method then parent class main() method will be executed while executing child class.
 * 
 * @author bhuwan
 *
 */
public class InheritanceForMainMethod {
    public static void main(String[] args) {
        System.out.println("Parent main method.");
    }
}

class Child1 extends InheritanceForMainMethod {

}
