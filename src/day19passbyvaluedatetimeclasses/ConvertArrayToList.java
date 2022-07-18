package day19passbyvaluedatetimeclasses;

import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {

    public static void main(String[] args) {

        Integer arr [] = {3, 4, 5, 6 };

        //When you create a list from an array by using "asList()" method, the length will be fiked like arrays.
        List<Integer> list = Arrays.asList(arr);
        System.out.println(list);

        //Try to remove an element from list
//        list.remove(1);
//        System.out.println(list);

        //Try to add an element into the list
//        list.add(7);
//        System.out.println(list);

        //Try to clear the list
//        list.clear();
//        System.out.println(list);


    }
}
