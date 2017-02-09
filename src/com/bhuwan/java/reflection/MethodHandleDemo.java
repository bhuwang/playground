/**
 * 
 */
package com.bhuwan.java.reflection;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.MethodType;

/**
 * @author bhuwan
 *
 */
public class MethodHandleDemo {

    public static void main(String[] args) throws Throwable {
        Lookup lookup = MethodHandles.lookup();
        MethodHandle findStatic = lookup.findStatic(MethodHandleDemo.class, "hello", MethodType.methodType(void.class));
        findStatic.invoke();
    }

    static void hello() {
        System.out.println("hello");
    }

}
