/**
 * 
 */
package com.bhuwan.java.serialization.inheritance;

/**
 * @author bhuwan
 *
 */
public class ParentNotSerialized {
    String username = "Bhuwan";
    int rollNo = 310;

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     *            the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the rollNo
     */
    public int getRollNo() {
        return rollNo;
    }

    /**
     * @param rollNo
     *            the rollNo to set
     */
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
