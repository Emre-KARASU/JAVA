package day20arraysandlists;

import java.util.Arrays;
import java.util.Scanner;

public class Q03 {


        /*	Type a code that takes array and
         	returns the difference between the biggest and the smallest numbers.
        	Ask user to enter array elements.
         */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the array..");
        int length = scan.nextInt();

        int array [] = new int[length];

        int i = 0;
        do{
            System.out.println("Enter the element that index of : " + i);
            array[i] = scan.nextInt();
            i++;
        } while(i < length);
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

        int difference = array[length-1] - array[0];

        System.out.println("The difference between smallest and largest : " + difference);

    }
}
