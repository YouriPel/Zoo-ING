package com.ing.zoo.model.animal;

import com.ing.zoo.model.animal.type.Omnivore;
import com.ing.zoo.model.Animal;

public class Pelican extends Animal implements Omnivore {

    public Pelican(String name) {
        super(name, "Flap flop");
    }

    @Override
    public void eatLeaves() {
        eatText = "Kwaak kwaak jummy";
        System.out.println(eatText);
    }

    @Override
    public void eatMeat() {
        eatText = "Mmmm fishy";
        System.out.println(eatText);
    }
}
