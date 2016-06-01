/**
 * 
 */
package com.bhuwan.java.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author bhuwan
 *
 */
public class InsertMultipleUsingPrepStmt {

    /**
     * @param args
     */
    public static void main(String[] args) {

        String username = null;
        String password = null;
        String fullName = null;

        String sql = "insert into user values(?,?,?)";
        String sql2 = "create table IF NOT EXISTS user(username varchar(50), password varchar(50), fullname varchar(50))";

        try (Connection con = DBConnection.getMySqlConnection(); PreparedStatement psmt = con.prepareStatement(sql);
                PreparedStatement psmt2 = con.prepareStatement(sql2);) {
            while (true) {
                // create table if not present.
                psmt2.executeUpdate();

                System.out.println("Enter your Username: ");
                Scanner scanner = new Scanner(System.in);
                username = scanner.nextLine();

                System.out.println("Enter your Password: ");
                password = scanner.nextLine();

                System.out.println("Enter your FullName: ");
                fullName = scanner.nextLine();

                psmt.setString(1, username);
                psmt.setString(2, password);
                psmt.setString(3, fullName);

                System.out.println("final query: " + psmt);
                psmt.executeUpdate();
                System.out.println("Data successfully updated!!");
                System.out.println();
                System.out.println("Do you want to add more? enter 1 or press any key to exit.");
                String wantToExit = scanner.next();
                if (!wantToExit.equals("1")) {
                    break;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
