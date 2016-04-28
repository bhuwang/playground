/**
 * 
 */
package com.bhuwan.java.serialization.inheritance;

import java.io.Serializable;

/**
 * @author bhuwan
 *
 */
public class ParentClass implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -3688764656730093090L;
    String username = "Bhuwan";
    String password = "Gautam";

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
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     *            the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
