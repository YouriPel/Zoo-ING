package com.ing.zoo;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        Lion henk = new Lion();
        henk.setName("henk");
        Hippo elsa = new Hippo();
        elsa.setName("elsa");
        Pig dora = new Pig();
        dora.setName("dora");
        Tiger wally = new Tiger();
        wally.setName("wally");
        Zebra marty = new Zebra();
        marty.setName("marty");

        //todo Create array with all animals
        // Check with Intance off which animal to call
        // Getters and setter to setName()
        Animal[] animals = new Animal[5];
        animals[0] = henk;
        animals[1] = elsa;
        animals[2] = dora;
        animals[3] = wally;
        animals[4] = marty;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();

        if (input.equals(commands[0])){
            for (Animal animal : animals) {
                //todo let all animals say hello
            }
        }

        if (input.equals(commands[0] + " henk")) {
            henk.sayHello();
        } else if (input.equals(commands[0] + " elsa")) {
            elsa.sayHello();
        } else if (input.equals(commands[1])) {
            elsa.eatLeaves();
        } else if (input.equals(commands[2])) {
            henk.eatMeat();
        } else {
            System.out.println("Unknown command: " + input);
        }
    }
}
