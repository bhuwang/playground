/**
 * 
 */
package com.bhuwan.java.basics.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @author bhuwan
 */
public class ParseAnnotation {
    public static void main(String[] args) {
        try {
            System.out.println("Outside............");
            for (Method method : Class.forName("com.bhuwan.java.basics.annotation.AnnotationsDemo").getMethods()) {
                System.out.println("Inside Method....." + method);
                if (method.isAnnotationPresent(MethodInfo.class)) {
                    System.out.println("Inside is Method Annotation present.....");
                    for (Annotation annotation : method.getDeclaredAnnotations()) {
                        
                        // logic for methods using this annotation.
                        System.out.println("Annotation in Method '" + method + "' : " + annotation);
                    }
                }
            }
        }
        catch (SecurityException | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
