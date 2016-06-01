/**
 * 
 */
package com.bhuwan.java.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author bhuwan
 *
 */
public class ConnectionUsingPropertiesDemo {

    /**
     * @param args
     * @throws IOException
     * @throws FileNotFoundException
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("resources/db.properties"));
        System.out.println("user: " + properties.getProperty("user"));
        System.out.println("pass: " + properties.getProperty("password"));

        Class.forName(properties.getProperty("driver"));
        Connection con = DriverManager.getConnection(properties.getProperty("url"), properties);
        System.out.println(con);
    }

}
