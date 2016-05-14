/**
 * 
 */
package com.bhuwan.java.collection.comparator;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author bhuwan
 *
 */
public class CustomObjectComparator {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Employee e1 = new Employee("Bhuwan", 101);
        Employee e2 = new Employee("Suman", 102);
        Employee e3 = new Employee("Krishna", 103);
        Employee e4 = new Employee("Pratiksha", 104);
        Employee e5 = new Employee("Prisha", 105);
        Employee e6 = new Employee("Prashiddhi", 106);
        Employee e7 = new Employee("Rusum", 107);
        Employee e8 = new Employee("Richan", 108);

        // using default comparable
        TreeSet<Employee> employees = new TreeSet<>();

        // using custom comparator
        // TreeSet<Employee> employees = new TreeSet<>(new EmployeeComparator());

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);
        employees.add(e7);
        employees.add(e8);

        System.out.println("Using default comparable:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        // using custom comparator
        TreeSet<Employee> employees1 = new TreeSet<>(new EmployeeComparator());

        employees1.add(e1);
        employees1.add(e2);
        employees1.add(e3);
        employees1.add(e4);
        employees1.add(e5);
        employees1.add(e6);
        employees1.add(e7);
        employees1.add(e8);

        System.out.println("\nUsing custom comparator:");
        for (Employee emp : employees1) {
            System.out.println(emp);
        }
    }

}

class Employee implements Comparable<Employee> {
    String fullName;
    Integer empId;

    public Employee() {
        // TODO Auto-generated constructor stub
    }

    public Employee(String fullName, Integer empId) {
        this.fullName = fullName;
        this.empId = empId;
    }

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName
     *            the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return the empId
     */
    public Integer getEmpId() {
        return empId;
    }

    /**
     * @param empId
     *            the empId to set
     */
    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Employee [fullName=" + fullName + ", empId=" + empId + "]";
    }

    @Override
    public int compareTo(Employee emp) {

        // order by empId - natural order
        return this.empId.compareTo(emp.getEmpId());

        // order by empId - reverse natural order
        // return -this.empId.compareTo(emp.getEmpId());

        // order by employee fullName - natural order
        // return this.fullName.compareTo(emp.getFullName());

        // order by employee fullName - reverse natural order
        // return -this.fullName.compareTo(emp.getFullName());
    }
}

class EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getFullName().compareTo(o2.getFullName());
    }

}