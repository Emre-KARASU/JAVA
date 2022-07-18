package day07stringmanipulations;

import java.util.Scanner;

public class Sm01 {

    public static void main(String[] args) {

        //1.Example: Print the first and last character of the given String on the console
        //"Java is easy" ==> Jy

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String..");
        String str = scan.nextLine();

        //1.Way:Using charAt() method
        char firstChar = str.charAt(0);

        //If you use "str.length()-1" inside the charAt() method you will get the last character in a String
        char lastChar = str.charAt(str.length()-1);

        System.out.println(""+firstChar + lastChar);

        //2.Way:Using substring() method,
        //str.substring(a,b) means starting from a. index until b. index. Do not forget a is inclusive b is exclusive
        String firstCharacter = str.substring(0,1);

//        String lastCharacter = str.substring(str.length()-1);
        String lastCharacter = str.substring(str.length()-1 , str.length());

        System.out.println(firstCharacter+lastCharacter);



        //2.Example : Type a code to get initials of first name and the last name of a give name.(please enter just first and last name)
        //Ali Can ==> AC, Mary Star == MS
        String initialOfFirstName = str.substring(0,1);

        //how to find index of last name
        //1)Find the index of space. str.indexOf(" ")==> gives us index os space
        //2)increase the index of space by 1 then you will be able to find the index of last name.
        int indexOfInitialOfLastName = str.indexOf(" ") + 1;
        String initialOfLastName = str.substring(indexOfInitialOfLastName,indexOfInitialOfLastName+1);
        System.out.println(initialOfFirstName + initialOfLastName);

        //3.Example: Check if any character exists in a String or not
        //1:way:
        String characterToCheck = "X";
        int result =str.indexOf(characterToCheck);
        System.out.println(result);

        if(result==-1){
            System.out.println("The character does not exists..");
        } else {
            System.out.println("The character exists..");
        }

        //2.Way:
        //Java created contains() method to check if a spesific character exists in a string or not
        boolean isContain = str.contains("X");
        if(isContain){
            System.out.println("The character exists in the string");
        } else {
            System.out.println("The character does not exists..");
        }

        /*
        The methods we learned so far:
        1) equals()
        2)equalsIgnoreCase()
        3)length()
        4)toUpperCase
        5)toLowerCase
        6)contains
        7)charAt()
        8)indexOf
        9)substring(with 1 index)
        10)substring(with 2 indexes)

         */

    }

}
