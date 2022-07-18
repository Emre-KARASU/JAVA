package day27exception;

public class E02 {
    /*
    Note: If Exceptions happen after executing code on the console, the Exceptions are called "Run Time Exception"
          The other name of "Run Time Exception" is "Unchecked Exceptions"

   Run Time Exceptions:
    1) ArithmeticException   2)ArrayIndexOutOfBoundsException    3)NullPointerException  4)NumberFormatException
    5)StringIndexOutOfBoundsException 6)ClassCastException
     */
    public static void main(String[] args) {

        Object obj = 70;
        convertObjectToString(obj);//ClassCastException => Integer cannot be cast to String
    }

    public static void convertObjectToString(Object obj){
        try {
            String s = (String) obj; //type casting
            System.out.println(s);
        } catch (ClassCastException e){
            System.out.println("Conversion is impossible between these data types => " + e.getMessage());
        }
    }
}
