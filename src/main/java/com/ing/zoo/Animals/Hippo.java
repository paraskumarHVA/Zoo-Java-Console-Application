package main.java.com.ing.zoo.Animals;

public class Hippo extends Animal implements Herbivore {
    private String eatText;
    private String helloText;

    public Hippo(String name)
    {
        super(name);
    }

    @Override
    public void sayHello()
    {
        helloText = "splash";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves()
    {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }
}
