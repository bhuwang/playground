/**
 * 
 */
package com.bhuwan.java.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author bhuwan
 *
 */
public class AceessPrivateMethodDemo {

    /**
     * @param args
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     * @throws SecurityException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalArgumentException
     */
    public static void main(String... args) throws ClassNotFoundException, InstantiationException, IllegalAccessException,
            NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Class c = Class.forName("com.bhuwan.java.reflection.PrivateMethod");
        PrivateMethod pm = (PrivateMethod) c.newInstance();
        Method privateMethod = c.getDeclaredMethod("privateMethod", null);
        privateMethod.setAccessible(true);
        privateMethod.invoke(pm, null);
    }

}
