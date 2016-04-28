/**
 * 
 */
package com.bhuwan.java.serialization;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author bhuwan
 *
 */
public class Accounts implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 7767714535635132473L;
    String username = "Bhuwan";
    transient String password = "Gautam";

    private void writeObject(ObjectOutputStream oos) throws Exception {
        System.out.println("Inside write object.................");
        oos.defaultWriteObject();
        String pwd = password + "abc";
        oos.writeObject(pwd);
    }

    private void readObject(ObjectInputStream ois) throws Exception {
        System.out.println("Inside read object.................");
        ois.defaultReadObject();
        String pwd = (String) ois.readObject();
        password = pwd.substring(0, pwd.length() - 3);
    }

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
