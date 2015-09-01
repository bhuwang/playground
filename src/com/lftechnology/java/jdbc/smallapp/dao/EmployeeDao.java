package com.lftechnology.java.jdbc.smallapp.dao;

import java.sql.SQLException;

import com.lftechnology.java.jdbc.smallapp.model.Employee;


public interface EmployeeDao {
    public Employee login(String username, String password) throws SQLException;
    
    public boolean addUser(Employee emp) throws SQLException;
    
    public boolean checkUserWithRole(String role) throws SQLException;
}
