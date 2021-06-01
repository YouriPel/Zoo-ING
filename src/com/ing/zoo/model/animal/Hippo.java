package com.ing.zoo.model.animal;

import com.ing.zoo.model.animal.type.Herbivore;
import com.ing.zoo.model.Animal;

public class Hippo extends Animal implements Herbivore {

    public Hippo(String name) {
        super(name, "splash");
    }

    @Override
    public void eatLeaves() {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }
}
