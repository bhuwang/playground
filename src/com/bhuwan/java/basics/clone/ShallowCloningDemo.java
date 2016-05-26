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
        CloneCat cat = new CloneCat(10);
        CloneDog dog = new CloneDog(cat, 20);
        // clone the dog object and change the cat internal variable.
        CloneDog dog2 = (CloneDog) dog.clone();
        System.out.println(dog.i + " : " + dog.c.i);
        dog2.i = 888;
        dog2.c.i = 999;
        System.out.println(dog.i + " : " + dog.c.i);
    }

}
