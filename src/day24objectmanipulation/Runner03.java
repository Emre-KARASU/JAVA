package day24objectmanipulation;

import java.util.Scanner;

public class Runner03 {
   /*
    Ask user their name and lastname
    Then generate an email for them
    concatenate  firstname and lastname
    and "@gmail.com" then print email for the user on the console
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please type your name and surname...");

//        String name = scan.nextLine();
//        String lastname= scan.nextLine();
        //                                  name             lastname
        Person person1 = new Person(scan.nextLine(), scan.nextLine());
        System.out.println(person1.name);
        System.out.println(person1.lastname);
        System.out.println(email(person1));
    }

    public static String email(Person person){
        String email = (person.name + person.lastname + "@gmail.com").replaceAll(" ","").toLowerCase();
        return email;
    }
}
