package com.bhuwan.java.jdbc.smallapp.service;

import java.sql.SQLException;

import com.bhuwan.java.jdbc.smallapp.dao.EmployeeDao;
import com.bhuwan.java.jdbc.smallapp.dao.EmployeeDaoImpl;
import com.bhuwan.java.jdbc.smallapp.model.Employee;
import com.bhuwan.java.jdbc.smallapp.util.Role;

public class EmployeeServiceImpl implements EmployeeService {

    EmployeeDao employeeDao = new EmployeeDaoImpl();

    @Override
    public Employee login(String username, String password) throws SQLException {
       return employeeDao.login(username, password);
    }

    @Override
    public boolean addUser(Employee emp) throws SQLException {
       return employeeDao.addUser(emp);
    }

    @Override
    public boolean checkUserWithRole(String role) throws SQLException {
        return employeeDao.checkUserWithRole(role);
    }

    @Override
    public void insertUserIfNotExist(String role) throws SQLException {
        if (!checkUserWithRole(role)) {
            addUser(generateDefaultUser());
        }
    }
    
    private Employee generateDefaultUser() {
        Employee emp = new Employee();
        emp.setUsername("bhuwan");
        emp.setPassword("gautam");
        emp.setDepartment("computer");
        emp.setFullname("Bhuwan Gautam");
        emp.setRole(Role.admin);
        emp.setAddress("Pokhara");
        return emp;
    }

}
