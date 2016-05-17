/**
 * 
 */
package com.bhuwan.java.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author bhuwan
 *
 */
public class SortByMultipleFields {

    /**
     * @param args
     */
    public static void main(String[] args) {
        List<EmployeeDemoClass> list = new ArrayList<>();
        list.add(new EmployeeDemoClass(103, "Bipen", "JAVA"));
        list.add(new EmployeeDemoClass(104, "Bipen", "PHP"));
        list.add(new EmployeeDemoClass(102, "Pawal", "JAVA"));
        list.add(new EmployeeDemoClass(105, "Bhuwan", "PHP"));
        list.add(new EmployeeDemoClass(101, "Bhuwan", "JAVA"));
        System.out.println("Before Sorting: ");
        for (EmployeeDemoClass emp : list) {
            System.out.println(emp);
        }
        Collections.sort(list);
        System.out.println("After Default Sorting: ");
        for (EmployeeDemoClass emp : list) {
            System.out.println(emp);
        }
        Collections.sort(list, new SortByDepartmentAndName());
        System.out.println("Sort by Dept and Name: ");
        for (EmployeeDemoClass emp : list) {
            System.out.println(emp);
        }
    }

}

class SortByDepartmentAndName implements Comparator<EmployeeDemoClass> {

    @Override
    public int compare(EmployeeDemoClass o1, EmployeeDemoClass o2) {
        int deptRes = o1.getDepartment().compareTo(o2.getDepartment());
        if (deptRes != 0) {
            return deptRes;
        } else {
            return o1.getName().compareTo(o2.getName());
        }
    }
}

class EmployeeDemoClass implements Comparable<EmployeeDemoClass> {
    private String name;
    private String department;
    private Long id;

    public EmployeeDemoClass(long id, String name, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department
     *            the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int compareTo(EmployeeDemoClass o) {
        return this.getId().compareTo(o.getId());
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "EmployeeDemoClass [name=" + name + ", department=" + department + ", id=" + id + "]";
    }
}
