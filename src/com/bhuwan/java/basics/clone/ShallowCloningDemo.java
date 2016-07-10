/**
 * 
 */
package com.bhuwan.java.basics.clone;

/**
 * In shallow cloning Object.cone() method will do the job. By cloned object reference if we perform any change to the contend object, then
 * those changes will be reflected to the main object as well.
 * 
 * <pre>
 * If the object contained only primitive variables then there is no need for deep cloning.
 * </pre>
 * 
 * @author bhuwan
 *
 */
public class ShallowCloningDemo {

    /**
     * @param args
     * @throws CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        Cat cat = new Cat(10);
        Dog dog = new Dog(cat, 20);
        // clone the dog object and change the cat internal variable.
        Dog clonedDog = (Dog) dog.clone();
        System.out.println(dog.i + " : " + dog.c.i);
        clonedDog.i = 888;
        clonedDog.c.i = 999;
        System.out.println(dog.i + " : " + dog.c.i);
    }

}
