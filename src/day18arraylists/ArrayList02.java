package day18arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList02 {

             /*
             Ask user to enter a letter
             If the letter exists in the list convert it to "Got it"
             otherwise, add the element user entered into the list
             */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a letter please");
        String letter = scan.next().toUpperCase();

        ArrayList<String> list = new ArrayList<>();
        list.add("J");
        list.add("A");
        list.add("V");

        System.out.println(list);

        if(list.contains(letter)){
            list.set(list.indexOf(letter), "Got it!" );
        } else {
            list.add(letter);
        }
        System.out.println(list);

    }

}
