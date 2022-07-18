package day26exception;

public class E01 {

    /*
    1)Exceptions means un-expected issues in your codes.
    Like "Gas finishing" in your vacation.
    2)There are 2 ways to work with Exceptions
    a) Exception Handling => try catch blocks
    b) Throw exception
     */

    public static void main(String[] args) {

        divide(12,4); //3

        divide(0,5);//0

        divide(12,0);//No answer in Math
                          //Could not divide ==>/ by zero
    }

    /*
    1) If you think any problem can occur for any line of code, put inside the try block and create a catch block.
    2)Inside the catch block parenthesis put possible exception class.
    3)By using "e.getMessage()" you can get the technical message.
    4)If you want you can put a non-technical message inside the catch body.
    5)If the codes inside the try body works without any issue, catch-block will not be executed
****6)After any exception occurred next lines of codes cannot be executed.JAVA STOPS EXECUTION.
     */

    public static void divide(int a, int b) {
        try{
            System.out.println(a / b);
            System.out.println("Hiii!");
            System.out.println("BYeee");
            System.out.println("========");
        } catch(ArithmeticException e){
            System.out.println("Could not divide ==>" + e.getMessage());
        }

//        Note: Following code is not recommended because it needs math knowledge
//        if (b == 0) {
//            System.out.println("Divisor cannot be 0");
//        } else {
//            System.out.println(a / b);
//        }

    }

}
