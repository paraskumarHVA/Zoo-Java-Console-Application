package main.java.com.ing.zoo.Animals;

public class Zebra extends Animal implements Herbivore {

    public Zebra(String name)
    {
        super(name);
    }

    @Override
    public void sayHello()
    {
        System.out.println("zebra zebra");
    }

    @Override
    public void eatLeaves()
    {
        System.out.println("munch munch zank yee bra");
    }
}
