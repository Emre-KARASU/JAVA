package day28abstraction;

public class Sheep extends Animal{

    String sound;
    String name;

    public Sheep(String sound,String name){
        this.sound=sound;
        this.name=name;
    }


    @Override
    public void animalSound() {
        System.out.println("animal sound is " + sound);
    }

    @Override
    public void animalName() {
        System.out.println("animal name is " + name);
    }
}
