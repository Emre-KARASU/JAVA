package day20arraysandlists;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {

    /*
   Ebay Interview Questions
   Get a String and a character from user
   Count the number of characters between the first occurrence and the last occurrence of the given character in the String
   Do not count the space characters
   If the character which user selected is displayed just once in the String return -1
   If the character which user selected does not exist in the String return -1
   For example; "Java is easy" - 'a' ==> 5
                "Java is easy" - 'w' ==> -1
                "Java is easy" - 'e' ==> -1
       */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string...");
        String str = scan.nextLine();

        System.out.println("Enter a character..");
        char ch = scan.next().charAt(0);

        int firstOccurence = str.indexOf(ch);
        int lastOccurence = str.lastIndexOf(ch);

        int counter = 0;

        if(firstOccurence == lastOccurence){
            System.out.println(-1);
        } else {

            for(int i =firstOccurence+1; i < lastOccurence; i++){
                if(str.charAt(i) != ' '){
                    counter++;
                }
            }

            System.out.println("Number of characters between first occurence and last occurence: " + counter);
        }

    }
}
