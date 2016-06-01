/**
 * 
 */
package com.bhuwan.java.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.ResultSetMetaData;

/**
 * @author bhuwan
 *
 */
public class ResultMetaDataDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Connection con = DBConnection.getMySqlConnection(); Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from user")) {
            ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
            System.out.println("Table Name: " + rsmd.getTableName(1));
            System.out.println("Total columns: " + rsmd.getColumnCount());

            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                System.out.println("Column Name: " + rsmd.getColumnName(i) + " Column Type: " + rsmd.getColumnTypeName(i));
                // System.out.println("Schema Name: " + rsmd.getSchemaName(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
