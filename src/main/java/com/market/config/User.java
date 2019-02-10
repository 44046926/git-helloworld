package com.market.config;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = -3833599868379708869L;

    /**
     * age : 13
     * name : zhangsan
     */

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
