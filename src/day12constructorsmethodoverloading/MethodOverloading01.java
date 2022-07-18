package day12constructorsmethodoverloading;

public class MethodOverloading01 {




    public static void main(String[] args) {

        /*
        1)If you have multiple methods whose names are same,
        Java looks at the parameter to select a specific method
        a)To select number of parameters are important
        b) To select data types of parameters are important.

        2) If you have multiple methods with the same name in a class
           it is called "Method Overloading"
           How can we achieve method overloading?
           i)Create method with the same name
           ii)Use different parameters
              a)Change the number of parameters
              b)Change data type of parameters
              c)If the data types are different, we can change their order.
         */


        //Method call
        System.out.println(add(2,5));
        System.out.println(add(3,6));
        System.out.println(add(10,12,13));
        System.out.println(add(1.5,2.5));
        System.out.println(add(4, 3.4));


    }
    //Create an add method which adds 2 integers
    //If you use a method inside the main you should add static keyword between access modifier and the return type
    public static int add(int a, int b){
        return a+b;
    }

    //Create an add method which adds 3 parameters
    public static int add(int a, int b, int c){
        return a+b+c;
    }

    //Create an add method which adds 2 doubles
    public static double add(double a, double b){
        return a + b;
    }


    //Create an add method which adds 1 integer and 1 double
    public static double add(int a, double b){
        return a + b;
    }

    //Create an add method which adds 1 double and 1 integer
    public static double add(double a, int b){
        return a + b;
    }


    public static void subs(int a, int b){//If you create your method void, you do not need add "return" inside the method body
        System.out.println(a-b);
    }


}
