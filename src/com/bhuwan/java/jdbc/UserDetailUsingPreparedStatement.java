/**
 * 
 */
package com.bhuwan.java.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * @author bhuwan
 */
public class UserDetailUsingPreparedStatement {
    private static final Logger LOGGER = Logger.getLogger(UserDetailUsingPreparedStatement.class.getName());

    /**
     * @param args
     */
    public static void main(String[] args) {
        String username = null;
        String password = null;

        System.out.println("Enter your Username: ");
        Scanner scanner = new Scanner(System.in);
        username = scanner.nextLine();

        System.out.println("Enter your Password: ");
        password = scanner.nextLine();

        String sql = "insert into user(username, password, fullname) values('bhuwan@gmail.com','password','Bhuwan Gautam')";
        sql = "select * from user where username=? and password=?";
        System.out.println("Final Query:: " + sql);
        try (Connection con = DBConnection.getMySqlConnection();
                PreparedStatement stmt = con.prepareStatement(sql);
                ) {
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            boolean hasMatched = false;
            while (rs.next()) {
                hasMatched = true;
                System.out.println("Full Name: " + rs.getString("fullname"));
            }
            if (!hasMatched) {
                System.out.println("Username or Password not matched.");
            }
            LOGGER.info("Updated successfully");
        }
        catch (SQLException e) {
            e.printStackTrace();
            LOGGER.info("Expection occured while Updating - " + e.getMessage());
        }

    }

}
