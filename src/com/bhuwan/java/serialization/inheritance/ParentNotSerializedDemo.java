/**
 * 
 */
package com.bhuwan.java.serialization.inheritance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * If the parent object is not serialized then the parent members won't participate in serialization.
 * 
 * @author bhuwan
 *
 */
public class ParentNotSerializedDemo extends ParentNotSerialized implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 2835890233410897824L;

    String childVar = "New Child";

    /**
     * @param args
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ParentNotSerializedDemo onlyChild = new ParentNotSerializedDemo();
        onlyChild.setUsername("Birodh");
        onlyChild.childVar = "CHild Var 2";
        onlyChild.setRollNo(311);

        System.out.println("Before Serialization: user - " + onlyChild.getUsername() + " roll:" + onlyChild.getRollNo() + " Child Var: "
                + onlyChild.childVar);

        // serialize
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(onlyChild);

        System.out.println("AFTER Serialization: user - " + onlyChild.getUsername() + " roll:" + onlyChild.getRollNo() + " Child Var: "
                + onlyChild.childVar);

        // de-serialize
        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ParentNotSerializedDemo child = (ParentNotSerializedDemo) ois.readObject();

        // print the value
        System.out.println(
                "AFTER DE-Serialization: user - " + child.getUsername() + " roll:" + child.getRollNo() + " Child Var: " + child.childVar);
    }

}
