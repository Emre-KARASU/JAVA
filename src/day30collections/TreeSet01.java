package day30collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {

    public static void main(String[] args) {

        /*
        If you need to use elements in a natural order, then use TreeSet it will sort elements in ascending order.
        HashSet is faster than TreeSet but TreeSet can order elements.
         */

//        TreeSet<Integer> ts1 = new TreeSet<>();
//        ts1.add(35);
//        ts1.add(12);
//        ts1.add(58);
//        ts1.add(0);
//        ts1.add(-9);
//        ts1.add(2);
//        ts1.add(12);
//        ts1.add(35);
//        System.out.println(ts1);//[-9, 0, 2, 12, 35, 58]

        /*
        Interview Question: How to store unique elements in natural order?
        We can use TreeSet.
        Yes, but as you know it is slow. how can you make it faster?
        I will create a HashSet and add all elements to a HashSet then I can convert it to a TreeSet
         */

        //1.Way:
        Long t1 = System.nanoTime();
        TreeSet<String> ts2 = new TreeSet<>();
        ts2.add("K");
        ts2.add("Z");
        ts2.add("A");
        ts2.add("C");
        ts2.add("T");
//        System.out.println(ts2);// [A, C, K, T, Z]


        Long t2 = System.nanoTime();
        //2.Way:
        HashSet<String> hs1 = new HashSet<>();
        hs1.add("K");
        hs1.add("Z");
        hs1.add("A");
        hs1.add("C");
        hs1.add("T");
//        System.out.println(hs1);//[A, C, T, Z, K]
        TreeSet<String > ts3 = new TreeSet<>(hs1);
//        System.out.println(ts3);//[A, C, K, T, Z]

        Long t3 = System.nanoTime();

        System.out.println(t2-t1);
        System.out.println(t3-t2);




    }
}
