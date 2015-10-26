package com.bhuwan.java.jdbc.smallapp.controller;

import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.bhuwan.java.jdbc.smallapp.model.Employee;
import com.bhuwan.java.jdbc.smallapp.service.EmployeeService;
import com.bhuwan.java.jdbc.smallapp.service.EmployeeServiceImpl;
import com.bhuwan.java.jdbc.smallapp.util.Role;

public class EmployeeController {
    private static final Logger LOGGER = Logger.getLogger(EmployeeController.class.getName());
    EmployeeService employeeService = new EmployeeServiceImpl();

    public static void main(String[] args) {
        EmployeeController mainLoader = new EmployeeController();
        // generate default user
        // Check if the admin user already exists, if not exist create here.
        try {
            mainLoader.employeeService.insertUserIfNotExist("admin");
        }
        catch (SQLException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        try (Scanner scanner = new Scanner(System.in);) {
            boolean isLoggedIn = false;
            Employee emp = null;
            String myOption;
            while (true) {
                if (!isLoggedIn) {
                    System.out.println("Enter username: ");
                    String username = scanner.nextLine();
                    System.out.println("Enter password: ");
                    String password = scanner.nextLine();
                    LOGGER.info("mainLoader.employeeService.login(username, password):: "
                            + mainLoader.employeeService.login(username, password));
                    emp = mainLoader.employeeService.login(username, password);
                    isLoggedIn = emp != null;
                    if (isLoggedIn)
                        LOGGER.info("User with role " + emp.getRole() + " logged in successfully " + new Date());
                }
                if (isLoggedIn) {
                    isLoggedIn = true;
                    mainLoader.displayWelcomeScreen(emp);
                    myOption = scanner.nextLine();
                    // User selection
                    mainLoader.userSelection(myOption, emp, scanner);
                }
                else {
                    System.out.println("Username or Password does not matched.");
                }
            }
        }
        catch (SQLException e) {
            e.printStackTrace();

            LOGGER.log(Level.SEVERE, "Exception while trying to login: " + e.getClass() + " message: " + e.getMessage());
        }
    }

    private void displayWelcomeScreen(Employee emp) {
        System.out.println("\n\nWelcome " + emp.getFullname());
        System.out.println("\nSelect Your Options:");
        System.out.println("1. Search User");
        System.out.println("2. Quit");
        if (emp.getRole().equals(Role.admin)) {
            System.out.println("3. Add User");
        }
    }

    private Employee diplayAddUserMenu(Employee emp, Scanner scanner) {
        String username;
        String password;
        String fullname;
        String address;
        String department;
        Role role;

        System.out.println("Enter the following user detail:");
        System.out.println("\nUsername: ");
        username = scanner.nextLine();
        System.out.println("Password: ");
        password = scanner.nextLine();
        System.out.println("Fullname: ");
        fullname = scanner.nextLine();
        System.out.println("Address: ");
        address = scanner.nextLine();
        System.out.println("Department: ");
        department = scanner.nextLine();
        System.out.println("role: ");
        role = Role.valueOf(scanner.nextLine());

        // Construct employee
        return constructEmployee(username, password, fullname, address, department, role);
    }

    private Employee constructEmployee(String username, String password, String fullname, String address,
            String department, Role role) {
        Employee newEmp = new Employee();
        newEmp.setFullname(fullname);
        newEmp.setUsername(username);
        newEmp.setPassword(password);
        newEmp.setAddress(address);
        newEmp.setDepartment(department);
        newEmp.setRole(role);
        return newEmp;
    }

    private void userSelection(String myOption, Employee emp, Scanner scanner) throws SQLException {

        if (emp.getRole().equals(Role.user) && !myOption.isEmpty() && myOption.trim().equals("3")) {
            return;
        }
        switch (myOption) {
            case "3":
                Employee newEmployee = diplayAddUserMenu(emp, scanner);
                employeeService.addUser(newEmployee);
                System.out.println("User " + newEmployee.getFullname() + " added successfully.");
                break;
            case "1":
                System.out.println("Coming Soon!!");
                break;
            case "2":
                System.out.println("Good Bye Mr. " + emp.getFullname());
                System.exit(0);
                break;
            default:
                break;
        }
    }
}
