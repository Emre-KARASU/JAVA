package day24objectmanipulation;

import java.util.Scanner;

public class Runner01 {

    public static void main(String[] args) {
         /*
        Type a program that asks user their name and lastname, then create an email for the user
        concatenate the name and lastname then add @gmail.com
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name...");
        String firstname = scan.nextLine().replace(" ","").toLowerCase();

        System.out.println("Enter your last name...");
        String lastname = scan.nextLine().replaceAll(" ","").toLowerCase();

        System.out.println("The email: " + getEmail(firstname,lastname));

    }
    public static String getEmail(String firstname, String lastname){
        return firstname+lastname+"@gmail.com";
    }

}
