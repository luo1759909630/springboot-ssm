package com.ssm.demo.domain;

import java.io.Serializable;

public class hostmaster implements Serializable {
    private  int id;
    private  String username;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
