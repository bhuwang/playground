/**
 * 
 */
package com.bhuwan.java.jvm.loading;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author bhuwan
 *
 */
class StudentOne {
    private String name;
    private int rollName;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the rollName
     */
    public int getRollName() {
        return rollName;
    }

    /**
     * @param rollName
     *            the rollName to set
     */
    public void setRollName(int rollName) {
        this.rollName = rollName;
    }
}

public class LoadedClassDetailsDemo {

    @SuppressWarnings("rawtypes")
    public static void main(String[] args) throws ClassNotFoundException {
        // Class student = Student.class;
        Class student = Class.forName("com.bhuwan.java.jvm.loading.StudentOne");
        Method[] declaredMethods = student.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println("Method Names:");
            System.out.print("\t" + method);
        }

        System.out.println();
        Field[] declaredFields = student.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println("Fields:");
            System.out.print("\t" + field);
        }
    }

}