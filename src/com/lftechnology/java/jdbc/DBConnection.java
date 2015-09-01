/**
 * 
 */
package com.lftechnology.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author bhuwan
 */
public class DBConnection {
    private static final Logger LOGGER = Logger.getLogger(DBConnection.class.getName());
    
    private static final String MYSQL_DRIVER="com.mysql.jdbc.Driver";
    //private static final String MYSQL_CONNECTION_STRING="jdbc:mysql://localhost:3306/playground";
    private static final String MYSQL_CONNECTION_STRING="jdbc:mysql://localhost:3306/playground?rewriteBatchedStatements=true";
    private static final String USERNAME="root";
    private static final String PASSWORD="liferay";
    
    private static final String ORACLE_DRIVER="oracle.jdbc.driver.OracleDriver";
    private static final String ORACLE_CONNECTION_STRING="jdbc:oracle:thin:@localhost:3306:playground";

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public static Connection getMySqlConnection() {
        Connection connection = null;
        try {
            Class.forName(MYSQL_DRIVER);
            connection = DriverManager.getConnection(MYSQL_CONNECTION_STRING, USERNAME, PASSWORD);
        }
        catch (ClassNotFoundException | SQLException e) {
            LOGGER.log(Level.SEVERE, "DBConnection#getConnection exception occured - Class: " + e.getClass()
                    + " message: " + e.getMessage());
        }
        return connection;
    }
    
    public static Connection getOracleConnection() {
        Connection connection = null;
        try {
            Class.forName(ORACLE_DRIVER);
            connection = DriverManager.getConnection(ORACLE_CONNECTION_STRING, USERNAME, PASSWORD);
        }
        catch (ClassNotFoundException | SQLException e) {
            LOGGER.log(Level.SEVERE, "DBConnection#getOracleConnection exception occured - Class: " + e.getClass()
                    + " message: " + e.getMessage());
        }
        return connection;
    }

}
