package com.ing.zoo.model.animal;

import com.ing.zoo.model.animal.type.Carnivore;
import com.ing.zoo.model.AcrobaticAnimal;

import java.util.Random;

public class Tiger extends AcrobaticAnimal implements Carnivore {

    public Tiger(String name) {
        super(name, "rraaarww");
    }

    @Override
    public void eatMeat() {
        eatText = "nomnomnom oink wubalubadubdub";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "jumps in tree";
        } else {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }
}
