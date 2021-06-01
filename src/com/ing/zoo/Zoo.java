package com.ing.zoo;

import com.ing.zoo.model.AcrobaticAnimal;
import com.ing.zoo.model.Animal;
import com.ing.zoo.model.animal.*;
import com.ing.zoo.model.animal.type.Carnivore;
import com.ing.zoo.model.animal.type.Herbivore;

import java.util.Scanner;

public class Zoo {

    private static String[] commands = new String[4];

    public static void main(String[] args) {

        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        Lion henk = new Lion("henk");
        Hippo elsa = new Hippo("elsa");
        Pig dora = new Pig("dora");
        Tiger wally = new Tiger("wally");
        Zebra marty = new Zebra("marty");
        Penguin max = new Penguin("max");
        Pelican youri = new Pelican("youri");

        Animal[] animals = new Animal[7];
        animals[0] = henk;
        animals[1] = elsa;
        animals[2] = dora;
        animals[3] = wally;
        animals[4] = marty;
        animals[5] = max;
        animals[6] = youri;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();

        letAnimalsRespond(input, animals);

    }

    private static void letAnimalsRespond(String command, Animal[] animals) {

        if (command.startsWith(commands[0])) {
            if (command.equals(commands[0])){
                letAllAnimalsSayHello(animals);
            } else {
                letAnimalSayHello(command, animals);
            }


        } else if (command.equals(commands[1])) {
            letAllHerbivoresEat(animals);

        } else if (command.equals(commands[2])) {
            letAllCarnivoresEat(animals);

        } else if (command.equals(commands[3])) {
            letAllAcrobaticAnimalsPerformTrick(animals);

        } else {
            System.out.println("Unknown command: " + command);
        }
    }

    private static void letAnimalSayHello(String command, Animal[] animals) {
        for (Animal animal : animals) {
            if (command.endsWith(animal.getName())){
                animal.sayHello();
            }
        }
    }

    private static void letAllAcrobaticAnimalsPerformTrick(Animal[] animals) {
        for (Animal animal : animals) {
            if (animal instanceof AcrobaticAnimal) {
                ((AcrobaticAnimal) animal).performTrick();
            }
        }
    }

    private static void letAllCarnivoresEat(Animal[] animals) {
        for (Animal animal : animals) {
            if (animal instanceof Carnivore) {
                ((Carnivore) animal).eatMeat();
            }
        }
    }

    private static void letAllHerbivoresEat(Animal[] animals) {
        for (Animal animal : animals) {
            if (animal instanceof Herbivore) {
                ((Herbivore) animal).eatLeaves();
            }
        }
    }

    private static void letAllAnimalsSayHello(Animal[] animals) {
        for (Animal animal : animals) {
            if (animal instanceof Carnivore) {
                ((Carnivore) animal).sayHello();
            } else if (animal instanceof Herbivore) {
                ((Herbivore) animal).sayHello();
            }
        }
    }
}
