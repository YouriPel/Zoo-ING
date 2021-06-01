package com.ing.zoo.model.animal;

import com.ing.zoo.model.animal.type.Herbivore;
import com.ing.zoo.model.AcrobaticAnimal;

import java.util.Random;

public class Zebra extends AcrobaticAnimal implements Herbivore {

    public Zebra(String name) {
        super(name, "zebra zebra");
    }

    @Override
    public void eatLeaves() {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        String[] tricks = {"Runs away", "Jumps over fence"};
        int rnd = new Random().nextInt(tricks.length);
        System.out.println(tricks[rnd]);
    }
}
