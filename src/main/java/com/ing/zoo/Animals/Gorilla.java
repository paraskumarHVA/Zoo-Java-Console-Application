package main.java.com.ing.zoo.Animals;

import java.util.Random;

public class Gorilla extends Animal implements Herbivore {
    private String eatText;
    private String helloText;
    private String trick;

    public Gorilla(String name)
    {
        super(name);
    }

    @Override
    public void sayHello()
    {
        helloText = "waaaaaah";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves()
    {
        eatText = "nomnom";
        System.out.println(eatText);
    }

    @Override
    public void performTrick()
    {
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
