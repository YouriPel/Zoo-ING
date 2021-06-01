package com.ing.zoo.model.animal;

import com.ing.zoo.model.animal.type.Carnivore;
import com.ing.zoo.model.AcrobaticAnimal;

import java.util.Random;

public class Penguin extends AcrobaticAnimal implements Carnivore {

    public Penguin(String name) {
        super(name, "Clap clap");
    }

    @Override
    public void eatMeat() {
        eatText = "Jummy fishy";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        String[] tricks = {"Tries to fly", "Belly slide"};
        int rnd = new Random().nextInt(tricks.length);
        System.out.println(tricks[rnd]);
    }
}
