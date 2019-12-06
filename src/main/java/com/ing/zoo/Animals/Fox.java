package main.java.com.ing.zoo.Animals;

public class Fox extends Animal implements Carnivore {

    public Fox(String name)
    {
        super(name);
    }

    @Override
    public void sayHello()
    {
        System.out.println("Wa-pa-pa-pa-pa-pa-pow");
    }

    @Override
    public void eatMeat()
    {
        System.out.println("nomnomnomnomnomnomnom thx");
    }
}
