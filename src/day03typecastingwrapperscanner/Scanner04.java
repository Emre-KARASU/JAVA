package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        //Type a code for calculating perimeter and area of a rectangle.
        // Take width and length of rectangle from user

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the width of rectangle..");
        int width = scan.nextInt();
        System.out.println("Enter the length of the rectangle..");
        int length = scan.nextInt();
        System.out.println("The area of rectangle: " + width*length);
        System.out.println("The perimeter of rectangle: " + 2*(width+length));

    }
}
