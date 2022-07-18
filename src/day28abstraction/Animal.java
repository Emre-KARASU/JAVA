package day28abstraction;

public abstract class Animal {

    /*
    create animalSound abstract method
    create animalName abstract method
     */

    public abstract void animalSound();
    public abstract void animalName();

     /*
    create 2 concrete classes
    1 will be Sheep
    2 will be Cat
    Then inherit Animal class
     */

    public void animalDrinkWater(){
        System.out.println("Animals drink water...");
    }


}
