package day04scannerifstatement;

import java.util.Scanner;

public class IfStatement02 {

    public static void main(String[] args) {
        //Ask user to enter an integer then
        //print "Even" if the integer is even
        //print "Odd" if the integer is odd
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer to check if it is even or odd");
        int num = scan.nextInt();

        //"Even means divisible by 2, "Odd" means not divisible by 2
        //In Java, we have Modulus(%) operator gives us the remainder
        // 5 % 2 = 1, 4 % 2 = 0

        //Note: "==" means equals      "!=" means not equal
        //Note: "!true" means false    "!false" true

        if(   num % 2 == 0  ){
            System.out.println("Even");
        }
        if (  num % 2 != 0   ){
            System.out.println("Odd");
        }




    }
}
