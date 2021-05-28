package com.ing.zoo;

public abstract class Animal {
    public String name;
    public String helloText;
    public String eatText;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHelloText() {
        return helloText;
    }

    public void setHelloText(String helloText) {
        this.helloText = helloText;
    }

    public String getEatText() {
        return eatText;
    }

    public void setEatText(String eatText) {
        this.eatText = eatText;
    }
}
