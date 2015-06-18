package com.gmail.miv;


abstract public class Human {

    String name;
    String secondName;

    public Human(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    abstract public String getInfo();
}
