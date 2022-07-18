package day08stringmanipulations;

public class Sm01 {

    public static void main(String[] args) {

        /*
        If you type code which runs just for spesific data it is called "Hard Coding"
        "Hard coding" is not acceptable.
         */

        String str = "Ali! is 13 years old, I think he is 20.";

        //1.Example: Remove all space from the String.
        String noSpace = str.replace(" ","");
        System.out.println(noSpace);

        //2.Example: Change digits to *
        //1.Way: Hard Coding
        String noDigit = str.replace("13","**").replace("15","**"); //Hard Coding
        System.out.println(noDigit);

        //2.way: without hard coding
        String noDigitDynamic = str.replaceAll("[0-9]","*");
        System.out.println(noDigitDynamic);

        //3.Example: Change all letters to !
        String noLetters = str.replaceAll("[A-Za-z]","!");
        System.out.println(noLetters);

        //4.Example:Change all characters different from letters  to ?
        String diffFromLetters = str.replaceAll("[^A-Za-z]","?");
        System.out.println(diffFromLetters);

        //5.Example: Change all characters different from digits to *
        String differentFromDigits = str.replaceAll("[^0-9]","*");
        System.out.println(differentFromDigits);

        //6.Example: Change all characters different from space to *
        //1.Way:
        String diffFromSpace1 = str.replaceAll("[^ ]", "*");
        System.out.println(diffFromSpace1);


        /*
        There is another structure for regular expressions
        1) \\s  means space character
        2) \\S means characters different from space character

        3) \\d means digits
        4) \\D means different from digits

        5) \\w means A-Z and a-z 0-9  _
        6) \\W means different from A-Z and a-z and 0-9 and   _

        7)) \\p{Punct}  means all punctuation marks
        8) \\P{Punct} means different from all punctuation marks

         */

        //2.way
       String diffFromSpace2 = str.replaceAll("\\S","*");
        System.out.println(diffFromSpace2);



        //7.Example: How many characters are used in string different from space?
       int numOfCharDiffFromSpace = str.replaceAll("\\s","").length();
        System.out.println(numOfCharDiffFromSpace);


        //8.Example : How many digits are used in the string?
       int numOfString = str.replaceAll("\\D","").length();
        System.out.println(numOfString);

        //9.Example: How many letters are used in string?
       int numOfLetters = str.replaceAll("[^A-Za-z]", "").length();
        System.out.println(numOfLetters);

        //10.Example: How many punctuation marks are used in the string?


        String punctionMarks = str.replaceAll("\\P{Punct}",""); //[^\\p{Punct}]
        System.out.println(punctionMarks);

        int numOfPuncMarks =  str.replaceAll("\\P{Punct}","").length();
        System.out.println(numOfPuncMarks);

    }
}
