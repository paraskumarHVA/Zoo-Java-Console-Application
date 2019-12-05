package main.java.com.ing.Animals;

public class Fox extends Animal implements Carnivore {
    private String helloText;
    private String eatText;

    public Fox(String name)
    {
        super(name);
    }

    @Override
    public void sayHello()
    {
        helloText = "Wa-pa-pa-pa-pa-pa-pow";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat()
    {
        eatText = "nomnomnomnomnomnomnom";
        System.out.println(eatText);
    }
}
