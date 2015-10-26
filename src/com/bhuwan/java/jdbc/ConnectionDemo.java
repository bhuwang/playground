/**
 * 
 */
package com.bhuwan.java.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

/**
 * @author bhuwan
 */
public class ConnectionDemo {
    private static final Logger LOGGER = Logger.getLogger(ConnectionDemo.class.getName());

    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Connection con = DBConnection.getMySqlConnection(); Statement stmt = con.createStatement();) {
            stmt.execute("create table tbl_one(id int primary key)");
            LOGGER.info("Table created successfully");
        }
        catch (SQLException e) {
            LOGGER.info("Expection occured while creating table.");
        }
    }
}
