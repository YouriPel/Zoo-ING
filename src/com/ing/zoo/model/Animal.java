package com.ing.zoo.model;

public abstract class Animal {
    private String name;
    protected String helloText;
    protected String eatText;

    protected Animal(String name, String helloText) {
        this.name = name;
        this.helloText = helloText;
    }

    public void sayHello() {
        System.out.println(helloText);
    }

    public String getName() {
        return name;
    }
}
