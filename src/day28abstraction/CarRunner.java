package day28abstraction;

public class CarRunner {

    public static void main(String[] args) {

//        Car car = new Car();
//        We cannot create object from abstract classes

//     data type                 constructor
        Car    car1    =   new   Toyota();

        car1.make();//My car is Toyota
        car1.model();//My car is a Camry
        car1.year();//My car year is 2022
        //Inheritance
        //poly morphism
        //abstraction

        System.out.println("=========================");

        Car car2 = new Honda();
        car2.make();//My car is Honda
        car2.model();//My car is a Accord
        car2.year();//My car year is 2022

    }
}
