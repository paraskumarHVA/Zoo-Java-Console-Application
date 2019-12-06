package main.java.com.ing.zoo.Animals;

import java.util.Random;

public class Tiger extends Animal implements Carnivore {

    public Tiger(String name)
    {
        super(name);
    }

    @Override
    public void sayHello()
    {
        System.out.println("rraaarww");
    }

    @Override
    public void eatMeat()
    {
        System.out.println("nomnomnom oink wubalubadubdub");
    }

    @Override
    public void performTrick()
    {
        String trick;
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "jumps in tree";
        }
        else
        {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }
}
