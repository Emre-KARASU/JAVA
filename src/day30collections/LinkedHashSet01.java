package day30collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class LinkedHashSet01 {

    public static void main(String[] args) {

        LinkedHashSet <Integer> lhs1 = new LinkedHashSet<>();
        lhs1.add(12);
        lhs1.add(33);
        lhs1.add(10);
        lhs1.add(32);
        lhs1.add(5);
        lhs1.add(5);
        System.out.println(lhs1);

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(2);
        list.add(3);
        System.out.println(list);//[5, 3, 2, 5, 2, 3]

        //Interview Question: Display all arrayLİst elements at once on th console.
        LinkedHashSet<Integer> lhs2 = new LinkedHashSet<>();
        lhs2.addAll(list);
        System.out.println(lhs2);//[5, 3, 2]

    }
}
