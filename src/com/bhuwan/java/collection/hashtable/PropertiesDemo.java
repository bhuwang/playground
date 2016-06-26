/**
 * 
 */
package com.bhuwan.java.collection.hashtable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author bhuwan
 *
 */
public class PropertiesDemo {

    /**
     * @param args
     * @throws IOException
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("src/com/bhuwan/java/collection/hashtable/application.properties"));
        System.out.println(prop);

        System.out.println("user: " + prop.getProperty("user"));
        prop.setProperty("pass", "password12345678");
        prop.store(new FileOutputStream("src/com/bhuwan/java/collection/hashtable/application.properties"), "Updated by Suman Gurung");
    }

}
