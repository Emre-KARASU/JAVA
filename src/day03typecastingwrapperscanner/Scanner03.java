package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner03 {


    public static void main(String[] args) {

        //ask user the price of t-shirt, and write it on the console==> price is in double

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the price of t-shirt..");
        double price = scan.nextDouble();
        System.out.println("The price is: " + price);

    }
}
