package com.ing.zoo.model;

/**
 * AcrobaticAnimal can do tricks
 */
public abstract class AcrobaticAnimal extends Animal {
    protected String trick;

    protected AcrobaticAnimal(String name, String helloText) {
        super(name, helloText);
    }

    public abstract void performTrick();
}
