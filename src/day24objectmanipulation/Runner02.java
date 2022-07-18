package day24objectmanipulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner02 {

    public static void main(String[] args) {
        /*
    Ask user to type 2 names and 2 lastnames
    Then concatenate them to create emails
    use @gmail.com at the end
    use lists..
     */

        List<String> firstname = new ArrayList<>();
        List<String> lastname = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Please type 2 names...");
        firstname.add(scan.nextLine());
        firstname.add(scan.nextLine());

        System.out.println("Please type 2 lastnames..");
        lastname.add(scan.nextLine());
        lastname.add(scan.nextLine());

        System.out.println(firstname);
        System.out.println(lastname);

        System.out.println("The email list: " + getEmailList(firstname,lastname));

    }
    public static List<String> getEmailList(List<String> firstname, List<String> lastname){
        List<String> emailList = new ArrayList<>();
        for(int i = 0; i < firstname.size(); i++){
            emailList.add((firstname.get(i) + lastname.get(i) + "@gmail.com").replaceAll(" ","").toLowerCase());
        }
        return emailList;
    }

}
