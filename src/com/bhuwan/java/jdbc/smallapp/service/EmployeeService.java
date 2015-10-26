/**
 * 
 */
package com.bhuwan.java.jdbc.smallapp.service;

import java.sql.SQLException;

import com.bhuwan.java.jdbc.smallapp.model.Employee;

/**
 * @author bhuwan
 */
public interface EmployeeService {

    public Employee login(String username, String password) throws SQLException;

    public boolean addUser(Employee emp) throws SQLException;
    
    public boolean checkUserWithRole(String role) throws SQLException;
    
    public void insertUserIfNotExist(String role) throws SQLException;

}
