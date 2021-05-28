package com.ing.zoo;

public class Zebra extends AcrobaticAnimal implements Herbivore {

    public Zebra()
    {
    }

    public void sayHello()
    {
        helloText = "zebra zebra";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {

    }
}
