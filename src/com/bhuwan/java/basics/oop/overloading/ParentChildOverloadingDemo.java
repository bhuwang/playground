/**
 * 
 */
package com.bhuwan.java.basics.oop.overloading;

/**
 * @author bhuwan
 *
 */
public class ParentChildOverloadingDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ParentChildOverloadingDemo demo = new ParentChildOverloadingDemo();

        Animal a = new Animal();
        demo.m1(a);

        Monkey m = new Monkey();
        demo.m1(m);

        Animal aa = new Monkey();
        // Overloading is also known as compile time polymorphism, early binding, or static polymorphism.
        demo.m1(aa);
    }

    public void m1(Animal animal) {
        System.out.println("Inside Animal overloaded method");
    }

    public void m1(Monkey monkey) {
        System.out.println("Inside Monkey overloaded method");
    }
}

class Animal {

}

class Monkey extends Animal {

}
