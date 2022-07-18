package day27exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E04 {
    /*
    1) When you use "throws" in the method name line, it means you are telling to Java " Hey Java, if you need help let me know"

    2) After "throws" keyword in the method name line, you can sue multiple Exception Classes like;
    throws IOException, ArithmeticExceptions

  **3)What are the differences between "throws" and "throw" keywords?
      a) "throws" can be used in method signature, "throw" can be used in method body
      b) After "throws" you can use multiple Exception Class Names.
         After "throw" you can use "new" keyword and the Constructor of Exception Class
      c)"throws" keyword used to handle "Checked Exceptions"
         "throw" keyword is used to throw exception whenever and whatever we want.

  **4)What is the difference between "final", "finally" and "finalize" keywords?

     */

    public static void main(String[] args) throws  IOException{

        FileInputStream fis = new FileInputStream("C:\\Users\\tugba\\eclipse-workspace\\.metadata\\winter2022java\\src\\day27exception\\File01.txt");
        int k = 0;
        while ((k = fis.read()) != -1) {
            System.out.print((char) k);
        }
        System.out.println();
        System.out.println("==============");

        printTheAge(-12);

    }
    //Create a method which throws "IllegalArgumentException" for negative ages.
    public static void printTheAge(int age) {

        if (age >= 0) {
            System.out.println(age);
        } else {
            throw new IllegalArgumentException("Ages can not be negative..");
        }
    }
}