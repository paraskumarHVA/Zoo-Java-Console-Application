package main.java.com.ing.zoo.Animals;

public class Zebra extends Animal implements Herbivore {
    private String helloText;
    private String eatText;

    public Zebra(String name)
    {
        super(name);
    }

    @Override
    public void sayHello()
    {
        helloText = "zebra zebra";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }
}
