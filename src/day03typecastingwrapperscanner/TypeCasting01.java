package day03typecastingwrapperscanner;

public class TypeCasting01 {

    public static void main(String[] args) {

    //byte < short < int < long < float < double


    //Type Casting: Converting small data type to large data type OR converting large data type to small data type
    //is called as Type Casting


        //Converting small data type to large : Auto Widening
    byte b = 47; //47==> byte
    int i = b;  // 47 ==>int
        System.out.println(i);


        //Converting large data type to small data type: Explicit Narrowing
        double d = 1.2;
        short s = (short) d;
        System.out.println(s);


        //Convert short 258 to byte..
        short r = 258;
        byte y = (byte) r;
        System.out.println(y);





}
}