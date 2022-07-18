package day22inheritance;

public class AnimalRunner {
    /*
    1) To make a class child of another class we use "extends" keyword
    2) We create parent*-child relationship :
        a) To prevent repetition
        b) To make maintenance easy
        c) To make classes atomic
    3) Child classes can use the methods of parent classes, but
    parents can not use child class methods
    4) A child can have parent, grandparent, grand grand parent etc..
      A parent can have child, grand child, gran grand child etc..
    5) Every class except "Object class (Like Adam and Eve) has parent class in Java
    6)Java supports "multi-level inheritance", "Hierarchical Inheritance", and "Single Inheritance"
      Java does not support "multiple inheritance"

   7)When you create an object in Inheritance, all constructors in parent classes work from top to bottom
     */

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.bark();
        dog1.feedBabyByMilk();
        dog1.eat();
        dog1.drink();

        System.out.println("=========");

        Cat cat1 = new Cat();
        cat1.meow();
        cat1.feedBabyByMilk();
        cat1.eat();
        cat1.drink();

        System.out.println("==========");

        Bird bird1 = new Bird();
        bird1.tweet();
        bird1.eat();
        bird1.drink();

        System.out.println("===========");

        Animal animal1 = new Animal();
        animal1.drink();
        animal1.eat();


    }
}
