package com.test.serial;

import java.io.Serializable;

/**
 * @author harry
 */
public class SuperClass implements Serializable {

    String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
