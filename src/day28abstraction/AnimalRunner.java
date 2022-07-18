package day28abstraction;

public class AnimalRunner {

    public static void main(String[] args) {

       Animal animal1 = new Cat("meow","Shero");

       animal1.animalSound();//Sound of animal is meow
       animal1.animalName();//Name of animal is Shero


        System.out.println("======================");


        Animal animal2 = new Sheep("meee","Shaun");
        animal2.animalName();//animal name is Shaun
        animal2.animalSound();//animal sound is meee


        System.out.println("======================");

        Sheep sheep = new Sheep("baa","Dolly");
        System.out.println(sheep.name);//Dolly
        System.out.println(sheep.sound);//baa
        sheep.animalName();//animal name is Dolly
        sheep.animalSound();//animal sound is baa

//        Animal animal = new Animal();

        //Differences between an abstract and a concrete class?
        //Abstract classes cannot generate any object, we can create objects from concrete classes
        //Abstract classes might have both abstract and concrete methods, but concrete class just can have concrete methods...

        /*
        Notes:
        1) Sometimes we need methods without(abstract method) we do not use the body of methods.
        2)To create an abstract method i) Do not put method body
                                       ii) use "abstract" keyword between access modifier and return type
                                       iii) "abstract methods" can be created just in " abstract classes"
                                       Note: to make a class abstract, use "abstract" keyword before class name.
       3)Abstract classes might have both abstract and concrete methods, but concrete class just can have concrete methods...
       4)Abstract methods MUST be overridden by all CONCRETE classes, but it is optional for concrete methods.
       If you want to make a functionality must for child classes use abstract method for the functionality.
       5)An abstract class have abstract child classes. It is not mandatory for "abstract child classes" to override "abstract methods"
       from parent class.
       6)Abstract methods can not be final because abstract methods will have newly updated body in every child class but final method means
       no update in the body.
       7) Abstract methods cannot be private because we create abstract methods for child class usage(because they do not have any body)
       but if you make "abstract methods" private child classes can not access to it.
       8)Abstract methods can not be static.

         */
























    }
}
