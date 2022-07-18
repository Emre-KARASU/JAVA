package day15arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays01 {

    public static void main(String[] args) {

        //Sort the elements according to their lengths ==> "Ali" - "Veli" - "Maria" - "Micheal"
        String srr [] = {"Veli", "Micheal", "Ali","Maria"};
        System.out.println(Arrays.toString(srr));
        Arrays.sort(srr, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(srr));

        //Sort the elements according their lengths in descending order.
        String trr [] = {"Veli", "Micheal", "Ali","Maria"}; // ["Micheal","Maria","Veli","Ali"]
        Arrays.sort(trr,Comparator.comparingInt(String::length).reversed());
        System.out.println(Arrays.toString(trr));

        //Sort the elements according their lengths in descending order.
        //If some elements are in the same length, put them in alphabetical order. "Michael"- "Maria" - "Ayse", "Veli" - "Ali" - "Can" - "Tan"
        String urr [] = {"Veli","Can", "Micheal", "Ayse", "Ali","Maria","Tan"};
        //naturalOrder() means alphabetical order in Strings, ascending in numbers.
        Arrays.sort(urr,Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(urr));



    }

}
