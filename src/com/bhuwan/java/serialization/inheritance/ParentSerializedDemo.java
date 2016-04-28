/**
 * 
 */
package com.bhuwan.java.serialization.inheritance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author bhuwan
 *
 */
public class ParentSerializedDemo extends ParentClass {
    String childVar = "New Child";

    /**
     * 
     */
    private static final long serialVersionUID = -9064692827601141167L;

    /**
     * @param args
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ParentSerializedDemo onlyParent = new ParentSerializedDemo();

        System.out.println("Before Serialization: user - " + onlyParent.getUsername() + " Pass:" + onlyParent.getPassword() + " Child Var: "
                + onlyParent.childVar);

        // serialize
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(onlyParent);

        // de-serialize
        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ParentSerializedDemo parent = (ParentSerializedDemo) ois.readObject();

        // print the value
        System.out.println("Before Serialization: user - " + parent.getUsername() + " Pass:" + parent.getPassword() + " Child Var: "
                + onlyParent.childVar);
    }

}
