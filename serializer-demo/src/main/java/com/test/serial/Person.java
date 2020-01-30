package com.test.serial;

import java.io.*;

/**
 * @author harry
 */
public class Person implements Cloneable,Serializable {

    private String name;

    private Email email;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        return (Person)super.clone();
    }

    public Person deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos=new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream=
                new ObjectOutputStream(bos);
        objectOutputStream.writeObject(this);

        ByteArrayInputStream bis=new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream objectInputStream=new ObjectInputStream(bis);
        return (Person) objectInputStream.readObject();

    }
}
