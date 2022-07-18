package day08stringmanipulations;

public class Sm02 {

    public static void main(String[] args) {


       String fullName = "   ";
        System.out.println(fullName);//    Ali Can


        String trimmedName = fullName.trim();
        System.out.println(trimmedName);//Ali Can

       //How can I understand if a string is empty or not?
        int numOfChar = fullName.length();
        if(numOfChar==0){
            System.out.println("You did not enter your name..");
        } else {
            System.out.println("You entered your name..");
        }

        //isEmpty() returns true if there is no character
        boolean isEmpty = fullName.isEmpty();
        System.out.println(isEmpty);


        //isBlank() returns true, if there is space characters or a space character or empty.
        //For that 3 scenarios isBlank() is used.
        boolean isBlank = fullName.isBlank();
        System.out.println(isBlank);


    }

}
