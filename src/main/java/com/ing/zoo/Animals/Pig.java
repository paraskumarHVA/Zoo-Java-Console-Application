package main.java.com.ing.zoo.Animals;

import java.util.Random;

public class Pig extends Animal implements Carnivore, Herbivore {

    public Pig(String name)
    {
        super(name);
    }

    @Override
    public void sayHello()
    {
        System.out.println("splash");
    }

    @Override
    public void eatLeaves()
    {
        System.out.println("munch munch oink");
    }

    @Override
    public void eatMeat()
    {
        System.out.println("nomnomnom oink thx");
    }

    @Override
    public void performTrick()
    {
        String trick;
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "rolls in the mud";
        }
        else
        {
            trick = "runs in circles";
        }
        System.out.println(trick);
    }
}
