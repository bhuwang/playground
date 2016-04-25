/**
 * 
 */
package com.bhuwan.java.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author bhuwan
 *
 */
public class SeriliazationDemo {

    /**
     * @param args
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Accounts acc = new Accounts();
        System.out.println("Before Serialization: user - " + acc.getUsername() + " pass - " + acc.getPassword());

        // serialize
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(acc);

        // de-serialize
        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Accounts account = (Accounts) ois.readObject();

        // print the value
        System.out.println("After Serialization: user - " + account.getUsername() + " pass - " + account.getPassword());
    }

}
