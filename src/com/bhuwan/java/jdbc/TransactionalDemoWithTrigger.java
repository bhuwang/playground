/**
 * 
 */
package com.bhuwan.java.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author bhuwan
 *
 */
public class TransactionalDemoWithTrigger {

    /**
     * Trigger Example:
     * 
     * delimiter | CREATE TRIGGER testInsertToUser AFTER INSERT ON user FOR EACH ROW BEGIN INSERT INTO test values('ab'); END; | delimiter ;
     * 
     */

    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Connection con = DBConnection.getMySqlConnection();) {
            String sql = "insert into user(username,password,fullname) values (?,?,?)";
            try (PreparedStatement stmt = con.prepareStatement(sql);) {
                stmt.setString(1, "username");
                stmt.setString(2, "password");
                stmt.setString(3, "fullname");
                stmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
