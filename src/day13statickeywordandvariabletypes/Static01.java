package day13statickeywordandvariabletypes;

public class Static01 {

    public static int sCounter = 0;//To create static(class) variable add "static keyword between access modifier and data type
    public int iCounter = 0;//To create instance(object) variable do not use static keyword.

    public Static01(){
        sCounter++;
        iCounter++;
    }

    public static void main(String[] args) {

        Static01 obj1 = new Static01();
        Static01 obj2 = new Static01();
        Static01 obj3 = new Static01();

        System.out.println("The value of sCounter: " + obj1.sCounter);
        System.out.println("The value of iCounter: " + obj1.iCounter);

        System.out.println("The value of sCounter: " + obj2.sCounter);
        System.out.println("The value of iCounter: " + obj2.iCounter);

        System.out.println("The value of sCounter: " + obj3.sCounter);
        System.out.println("The value of iCounter: " + obj3.iCounter);

        int age = 13; //If you create a variable inside a method it is called as "local variable"
        System.out.println(age);

        //1)Normally Java assign default values to variables but if it is a "local variable" Java does not assign any value to it
        //2)When you create a local variable you have to assign a value to it before using
        //3)Local variable cannot be used outside the method
        //Note: Static variables and instance variables can be used in entire class

    }

    public static int add(int a , int b){
        int c = 2; // c is a "local variable" because it is inside the add method
        return a + b;
    }

}
