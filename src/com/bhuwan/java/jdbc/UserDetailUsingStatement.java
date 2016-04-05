/**
 * 
 */
package com.bhuwan.java.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * @author bhuwan
 */
public class UserDetailUsingStatement {
    private static final Logger LOGGER = Logger.getLogger(UserDetailUsingStatement.class.getName());

    /**
     * @param args
     */
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        String username = null;
        String password = null;

        System.out.println("Enter your Username: ");
        Scanner scanner = new Scanner(System.in);
        username = scanner.nextLine();

        System.out.println("Enter your Password: ");
        password = scanner.nextLine();

        String sql = "insert into user(username, password, fullname) values('bhuwan@gmail.com','password','Bhuwan Gautam')";
        sql = "select * from user where username='" + username + "' and password='" + password + "'";
        System.out.println("Final Query:: " + sql);
        try (Connection con = DBConnection.getMySqlConnection();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
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
