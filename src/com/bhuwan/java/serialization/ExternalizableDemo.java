/**
 * 
 */
package com.bhuwan.java.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * @author bhuwan
 *
 */
public class ExternalizableDemo implements Externalizable {

    public ExternalizableDemo() {
        System.out.println("public constructotr");
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ExternalizableDemo ext = new ExternalizableDemo("Bhuwan", 10, 20);

        System.out.println("Before Externalization: user - " + ext.getS() + " i value: - " + ext.getI() + " j value: - " + ext.getJ());

        // serialize
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(ext);

        // de-serialize
        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ExternalizableDemo externalize = (ExternalizableDemo) ois.readObject();

        // print the value
        System.out.println("After Externalization: user - " + externalize.getS() + " i value: - " + externalize.getI() + " j value: - "
                + externalize.getJ());

    }

    String s;
    int i;
    int j;

    public ExternalizableDemo(String s, int i, int j) {
        this.s = s;
        this.i = i;
        this.j = j;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.io.Externalizable#writeExternal(java.io.ObjectOutput)
     */
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(s);
        out.writeInt(i);

    }

    /*
     * (non-Javadoc)
     * 
     * @see java.io.Externalizable#readExternal(java.io.ObjectInput)
     */
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        s = (String) in.readObject();
        i = in.readInt();
    }

    /**
     * @return the s
     */
    public String getS() {
        return s;
    }

    /**
     * @param s
     *            the s to set
     */
    public void setS(String s) {
        this.s = s;
    }

    /**
     * @return the i
     */
    public int getI() {
        return i;
    }

    /**
     * @param i
     *            the i to set
     */
    public void setI(int i) {
        this.i = i;
    }

    /**
     * @return the j
     */
    public int getJ() {
        return j;
    }

    /**
     * @param j
     *            the j to set
     */
    public void setJ(int j) {
        this.j = j;
    }

}
