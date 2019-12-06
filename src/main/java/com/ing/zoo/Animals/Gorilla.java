package main.java.com.ing.zoo.Animals;

import java.util.Random;

public class Gorilla extends Animal implements Herbivore {

    public Gorilla(String name)
    {
        super(name);
    }

    @Override
    public void sayHello()
    {
        System.out.println("waaaaaah");
    }

    @Override
    public void eatLeaves()
    {
        System.out.println("munch munch thx");
    }

    @Override
    public void performTrick()
    {
        String trick;
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "climbs in tree";
        }
        else
        {
            trick = "peel a banana";
        }
        System.out.println(trick);
    }
}
