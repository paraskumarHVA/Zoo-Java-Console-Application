package main.java.com.ing.zoo.Animals;

public class Lion extends Animal implements Carnivore {
    private String helloText;
    private String eatText;

    public Lion(String name)
    {
        super(name);
    }

    @Override
    public void sayHello()
    {
        helloText = "roooaoaaaaar";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat()
    {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }
}
