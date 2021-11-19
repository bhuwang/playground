/**
 * 
 */
package com.bhuwan.java.basics.oop.overriding;

/**
 * @author bhuwan
 *
 */
public class CovariantDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}

class ParentC {
    public Number m1() {
        return null;
    }
}

class ChildC extends ParentC {
    // since jdk 1.5 you can also return the child object instead of parent object.
    @Override
    public Byte m1() {
        return null;
    }
}
