/**
 * 
 */
package com.bhuwan.java.basics.oop.createobject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;
import java.util.Calendar;

/**
 * Program to demonstrate different ways to create objects.
 * 
 * @author bhuwan
 *
 */
public class CreateObjectDemo {

    /**
     * @param args
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     * @throws SecurityException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalArgumentException
     * @throws CloneNotSupportedException
     * @throws IOException
     */
    public static void main(String[] args)
            throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException,
            InvocationTargetException, NoSuchMethodException, SecurityException, CloneNotSupportedException, IOException {
        System.out.println("Following are the different ways to create objects:");
        // 1. using new operator
        Test1 test = new Test1("1. Using new operator");

        // 2. using newInstance() method - Call default constructor
        Test1 test2 = (Test1) Class.forName("com.bhuwan.java.basics.oop.createobject.Test1").newInstance();
        System.out.println(test2.m1("2. Using newInstance() method - Call default constructor"));

        // 3. using newInstance() method - Call parameterized constructor
        Test1 test3 = (Test1) Class.forName("com.bhuwan.java.basics.oop.createobject.Test1").getDeclaredConstructor(String.class)
                .newInstance("3. Using newInstanceMethod  - Calling parameterized constructor");

        // 4. Using factory method.
        Runtime runtime = Runtime.getRuntime();
        DateFormat instance2 = DateFormat.getInstance();
        Calendar instance = Calendar.getInstance();

        // 5. Using Clone method.
        // you must have to override the clone() method.
        Test1 test4 = (Test1) test.clone();
        System.out.println(test4.m1("5. Using clone"));

        // 6. using deserialization

        FileOutputStream fos = new FileOutputStream("Test1.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(test);

        FileInputStream fis = new FileInputStream("Test1.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Test1 test5 = (Test1) ois.readObject();
        System.out.println(test5.m1("6. Using deserialization"));

    }

}

class Test1 implements Cloneable, Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 482351728504309257L;

    public Test1() {
    }

    public Test1(String message) {
        System.out.println(message);
    }

    public String m1(String message) {
        return message;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
