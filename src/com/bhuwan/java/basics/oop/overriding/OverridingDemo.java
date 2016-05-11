/**
 * 
 */
package com.bhuwan.java.basics.oop.overriding;

/**
 * @author bhuwan
 *
 */
public class OverridingDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ParentClass p = new ParentClass();
        p.property();
        p.marriage();

        ChildClass c = new ChildClass();
        c.marriage();

        ParentClass p1 = new ChildClass();
        // in method overriding method resolution is always based on runtime object.
        // so in this case child class marriage method will be printed.
        // Overriding is also known as runtime polymorphism, late binding, or dynamic polymorphism.
        p1.marriage();
    }

}

class ParentClass {
    public void property() {
        System.out.println("2 ropani | 10 million rupees | 20 tola gold");
    }

    public void marriage() {
        System.out.println("Marriage with Rekha Thaa.");
    }
}

class ChildClass extends ParentClass {

    @Override
    public void marriage() {
        System.out.println("Marriage with Priyanka Karki.");
    }
}
