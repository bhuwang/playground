/**
 * 
 */
package com.bhuwan.java.basics.clone;

/**
 * In deep cloning programmer should take care of the clone method implementation. By cloned object reference if we perform any change to
 * the contend object, then those changes won't be reflect to the main object.
 * 
 * <pre>
 * If the object contained both primitive and reference variables and you want to make a complete separate copy, 
 * then we should go for deep cloning.
 * </pre>
 * 
 * @author bhuwan
 *
 */
public class DeepCloningDemo {

    /**
     * @param args
     * @throws CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        Cat cat = new Cat(10);
        DeepCloneDog dog = new DeepCloneDog(cat, 20);
        // clone the dog object and change the cat internal variable.
        DeepCloneDog dog2 = (DeepCloneDog) dog.clone();
        System.out.println(dog.i + " : " + dog.c.i);
        dog2.i = 888;
        dog2.c.i = 999;
        System.out.println(dog.i + " : " + dog.c.i);
    }

}

class DeepCloneDog implements Cloneable {
    Cat c;
    int i;

    public DeepCloneDog(Cat c, int i) {
        this.c = c;
        this.i = i;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Cat cat = new Cat(c.i);
        DeepCloneDog dog = new DeepCloneDog(cat, i);
        return dog;
    }

}
