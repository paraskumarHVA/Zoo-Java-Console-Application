package main.java.com.ing;

import main.java.com.ing.Animals.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zoo {

    private static final String[] COMMANDS = {"hello", "give leaves", "give meat", "perform trick"};
    private static final Integer HELLO_COMMAND_INPUT_LIMIT = 2;

    public static void main(String[] args)
    {
        Animal[] animalValues = {
                new Lion("henk"),
                new Hippo("elsa"),
                new Pig("dora"),
                new Tiger("wally"),
                new Zebra("marty"),
                new Gorilla("jack"),
                new Fox("diego")
        };
        Map<String, Animal> animals = createAnimalsMap(animalValues);

        runCommand(animals);
    }

    /**
     * This method will decide which command to run.
     * @param animals A Map with all animals.
     */
    private static void runCommand(Map<String, Animal> animals) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();
        if (input.split(" ", HELLO_COMMAND_INPUT_LIMIT)[0].equals(Zoo.COMMANDS[0])) {
            sayHello(animals, input);
        } else if (input.equals(Zoo.COMMANDS[1])) {
            giveLeaves(animals);
        } else if (input.equals(Zoo.COMMANDS[2])) {
            giveMeat(animals);
        } else if (input.equals(Zoo.COMMANDS[3])) {
            performTrick(animals);
        } else {
            System.out.println("Unknown command: " + input);
        }
    }

    /**
     * This method will decide which animal(s) has to say hello.
     * @param animals A Map with all animals.
     * @param input The command.
     */
    private static void sayHello(Map<String, Animal> animals, String input) {
        String[] inputs = input.split(" ", HELLO_COMMAND_INPUT_LIMIT);
        if (inputs.length >= HELLO_COMMAND_INPUT_LIMIT && !inputs[1].isEmpty()) {
            try {
                animals.get(inputs[1]).sayHello();
            } catch (NullPointerException e) {
                System.out.println("Could not find: " + inputs[1]);
            }
        } else {
            for (Animal animal : animals.values()) {
                animal.sayHello();
            }
        }
    }

    /**
     * This method will give the herbivores leaves.
     * @param animals The Map with all animals.
     */
    private static void giveLeaves(Map<String, Animal> animals) {
        for (Animal animal : animals.values()) {
            if (animal instanceof Herbivore) {
                Herbivore herbivore = (Herbivore) animal;
                herbivore.eatLeaves();
            }
        }
    }

    /**
     * This method will give the carnivores meat.
     * @param animals The Map with all animals.
     */
    private static void giveMeat(Map<String, Animal> animals) {
        for (Animal animal : animals.values()) {
            if (animal instanceof Carnivore) {
                Carnivore carnivore = (Carnivore) animal;
                carnivore.eatMeat();
            }
        }
    }

    /**
     * This method will let all animals that can do, do their tricks.
     * @param animals The Map with all animals.
     */
    private static void performTrick(Map<String, Animal> animals) {
        for (Animal animal : animals.values()) {
            animal.performTrick();
        }
    }
    /**
     * This method will create a Map of different animals.
     * @param animals Array with the different animals.
     * @return Map with animals.
     */
    private static Map<String, Animal> createAnimalsMap(Animal[] animals) {
        Map<String, Animal> animalsMap = new HashMap<>();

        for (Animal animal : animals) {
            animalsMap.put(animal.getName(), animal);
        }

        return animalsMap;
    }
}
