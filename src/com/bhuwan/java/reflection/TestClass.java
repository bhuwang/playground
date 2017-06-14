/**
 * 
 */
package com.bhuwan.java.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

/**
 * This class is resposible for....
 * 
 * @author bhuwan
 *
 */
public class TestClass {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        // with object
        Student s = new Student();
        // using Class.forName
        // Student s = (Student) Class.forName("com.lftechnology.java_training.Student").newInstance();
        // using ClassName.class
        // Class<? extends Student> c = Student.class;
        Class<? extends Student> c = s.getClass();
        System.out.println(c.getSuperclass().getName());
        int modifiers = c.getModifiers();
        System.out.println(Modifier.toString(modifiers));

        // Fields
        Field[] fields = c.getFields();
        for (Field f : fields) {
            System.out.println("====================================");
            System.out.println(f.getName());
            System.out.println(f.getType());
            int modifiers2 = f.getModifiers();
            System.out.println(Modifier.toString(modifiers2));
            System.out.println(f.get(s));
            System.out.println("====================================");
        }

        // methods
        Method[] methods = c.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println("====================================");
            System.out.println(m.getName());
            int modifiers2 = m.getModifiers();
            System.out.println(Modifier.toString(modifiers2));
            System.out.println(m.getReturnType());
            Parameter[] parameters = m.getParameters();
            for (Parameter p : parameters) {
                System.out.println(p);
            }
            System.out.println("====================================");
        }
    }

}
