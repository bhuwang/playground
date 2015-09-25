/**
 * 
 */
package com.lftechnology.java.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

/**
 * @author bhuwan
 */
public class BatchProcessingComparision {

    private static final Logger LOGGER = Logger.getLogger(BatchProcessingComparision.class.getName());

    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Connection con = DBConnection.getMySqlConnection();) {
            LOGGER.info("Execution Started........................");
            processingWithStatement(con);
            processingWithPreparedStatement(con);
            batchProcessingWithStatement(con);
            batchProcessingWithPreparedStatement(con);
            LOGGER.info("Execution Completed Successfully........................");
        }
        catch (SQLException e) {
            e.printStackTrace();
            LOGGER.info("Excepton occured while processing data." + e.getMessage() + " :: " + e.getClass());
        }
    }

    private static void processingWithStatement(Connection con) throws SQLException {
        try (Statement stmt = con.createStatement();) {
            long start = System.currentTimeMillis();
            for (int i = 0; i < 500; i++) {
                String query = "insert into user(username, password, fullname) values ('username" + i
                        + "','password','fullname')";
                stmt.executeUpdate(query);
            }
            System.out.println("Processing with Statement - Time Taken=" + (System.currentTimeMillis() - start));
        }
    }

    private static void processingWithPreparedStatement(Connection con) throws SQLException {
        String sql = "insert into user(username,password,fullname) values (?,?,?)";
        try (PreparedStatement stmt = con.prepareStatement(sql);) {
            long start = System.currentTimeMillis();
            stmt.setString(1, "username");
            stmt.setString(2, "password");
            stmt.setString(3, "fullname");
            for (int i = 0; i < 500; i++) {
                stmt.executeUpdate();
            }
            System.out
                    .println("Processing with PreparedStatement - Time Taken=" + (System.currentTimeMillis() - start));
        }

    }

    private static void batchProcessingWithStatement(Connection con) throws SQLException {
        try (Statement stmt = con.createStatement();) {
            long start = System.currentTimeMillis();
            for (int i = 0; i < 500; i++) {
                String query = "insert into user(username, password, fullname) values ('username" + i
                        + "','password','fullname')";
                stmt.addBatch(query);
                if (i % 100 == 0) {
                    stmt.executeBatch();
                }
            }
            System.out.println("Batch Processing with Statement - Time Taken=" + (System.currentTimeMillis() - start));
        }
    }

    private static void batchProcessingWithPreparedStatement(Connection con) throws SQLException {

        String sql = "insert into user(username, password, fullname) values (?,?,?)";
        try (PreparedStatement stmt = con.prepareStatement(sql);) {
            long start = System.currentTimeMillis();
            for (int i = 0; i < 500; i++) {
                stmt.setString(1, "username"+i);
                stmt.setString(2, "password");
                stmt.setString(3, "fullname");
                stmt.addBatch();
                if (i % 100 == 0) {
                    stmt.executeBatch();
                }
            }
            System.out.println("Batch Processing with PreparedStatement - Time Taken="
                    + (System.currentTimeMillis() - start));
        }

    }

}
