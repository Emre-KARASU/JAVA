package day24objectmanipulation;

import java.util.ArrayList;
import java.util.List;

public class Runner04 {

    public static void main(String[] args) {

       /*
    Create 3 person object
    Then create a method to concatenate the names with lastnames and add also "@gmail.com"
    Finally print them on the console
     */

        Person person1 = new Person("Kubra", "Tekin");
        Person person2 = new Person("Serjan", "Iskrenov");
        Person person3 = new Person("Ali", "Bingul");

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        System.out.println(personList);
        System.out.println(personList.size());

        System.out.println(getEmails(personList));
    }

    public static List<String> getEmails(List<Person> personList){
        List<String> emailList = new ArrayList<>();
//       for(String x : list)
        for(Person p : personList){
            emailList.add((p.name + p.lastname + "@gmail.com").replaceAll(" ", "").toLowerCase());
        }
        return emailList;
    }

}
