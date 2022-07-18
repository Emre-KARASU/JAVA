package day22inheritance;

public class Dog extends Mammal {
    //The class name before "extends" keyword is child class
    //The class name after "extends" keyword is parent class

    public void bark(){
        System.out.println("Dogs bark...");
    }

    public Dog(){
        System.out.println("Dog constructor");
    }
}
