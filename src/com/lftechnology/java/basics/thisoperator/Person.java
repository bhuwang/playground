/**
 * 
 */
package com.lftechnology.java.basics.thisoperator;

/**
 * @author bhuwan
 */
public class Person {
    private String firstName;
    private String lastName;
    private String empId;

    // 1.
    void methodName(String firstName) {
        this.firstName = firstName;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // 2.
    public Person(String firstName, String lastName, String empId) {
        this(firstName, lastName);
        this.empId = empId;
        display(this);
    }

    // 3.
    public void display(Person person) {
        System.out.println("firstName: " + person.getFirstName() + " lastName: " + person.getLastName() + " empId: "
                + person.getEmpId());
    }

    public static void main(String[] args) {
        new Person("Bhuwa", "Gautam", "101");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmpId() {
        return empId;
    }

}
