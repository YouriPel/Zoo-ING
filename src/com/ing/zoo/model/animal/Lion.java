package com.ing.zoo.model.animal;

import com.ing.zoo.model.animal.type.Carnivore;
import com.ing.zoo.model.Animal;

public class Lion extends Animal implements Carnivore {

    public Lion(String name) {
        super(name, "roooaoaaaaar");
    }

    @Override
    public void eatMeat() {
        helloText = "nomnomnom thx mate";
        System.out.println(helloText);
    }
}
