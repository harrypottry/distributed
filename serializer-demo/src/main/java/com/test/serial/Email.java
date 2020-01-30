package com.test.serial;

import java.io.Serializable;

/**
 * @author harry
 */
public class Email implements Serializable {


    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
