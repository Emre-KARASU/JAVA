package day03typecastingwrapperscanner;

public class WrapperClass {

    public static void main(String[] args) {
        /*1)Java created new structure by putting some methods into primitive data types,
       that structure called as "Wrapper Class"

       2)boolean ===> Boolean
         char    ===> Character
         byte    ===> Byte
         short   ===> Short
         int     ===> Integer
         float   ===> Float
         double  ===> Double

      3) Wrapper classes are non-primitive, they are stored heap memory.

         */

        //How to convert primitive data type to wrapper class? Autoboxing
        char c = 'd';
        Character wc = c;

        //How to convert wrapper class to primitive data type? Unboxing
        Short s = 24;
        short ps = s;


        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);



        //Find the min and max value of byte data type
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);


        //Find the sum of max value of short and min value of long
        System.out.println(Short.MAX_VALUE + Long.MIN_VALUE);


    }


}
