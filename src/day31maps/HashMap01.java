package day31maps;

import java.util.*;

public class HashMap01 {

    /*
    1) Maps use key-value structure.
    2) "keys" must be unique, "values" can be duplicated.
    3) "keys" cannot be null - except HashMaps, in HashMaps you can use "null" just once- as a key.

    4) In Hashmap "values" can use null many times.
    5) HashMap does not put elements in any order because of that HashMap is super fast.
    6) If you try to send into a map repeated key, Java will overwrite the value.
    7) HashMap is not thread safe and synchronized.
    ==> If you need some maps thread safe and synchronized ==> HashTable is thread safe and synchronized

    Note: Thread safety ==> thread safe or thread safe code in Java refers to code that can safely be utilized
                            in concurrent or multi- threading environment, and they will behave as expected.
     */


    public static void main(String[] args) {

//               Key     Value
        HashMap<Integer, String> hm1 = new HashMap<>();
        hm1.put(100,"Ali");
        hm1.put(101, "Veli");
        hm1.put(102, "Can");
        hm1.put(103," Canan");
        hm1.put(null, "Aliye");
        hm1.put(null, "Kemal");
        hm1.put(104,null);
        hm1.put(105,null);
        System.out.println(hm1);

        HashMap<Integer,String> hm2 = new HashMap<>();
        hm2.put(87,"K");
        hm2.put(88,"L");
        hm2.put(89,"M");
        hm2.put(100,"A");

        hm1.putAll(hm2);
        System.out.println(hm1);//When we add elements of a Map to another map, key and values data types' should be the same.
        System.out.println(hm1.size());

        hm1.putIfAbsent(102,"Z");//This means if key does not exist, create a new key value pair
        System.out.println(hm1);

        hm1.putIfAbsent(999,"Z");//This means if key does not exist, create a new key value pair
        System.out.println(hm1);

        String value = hm1.get(101);//If the key exists, it will give the value of that key
        System.out.println(value);

        String value2 =hm1.get(555);//If the key does not exist, it will give us null.
        System.out.println(value2);

        String value3 = hm1.getOrDefault(999, "This key is not in the map..");
        System.out.println(value3);//Z

        String value4 = hm1.getOrDefault(789, "This key is not in the map..");
        //If you do not have a valid key, this will return our custom message...
        System.out.println(value4);//This key is not in the map..


        Set<Integer> myKeys = hm1.keySet();//This keySet() will give us all the keys.
        System.out.println(myKeys);//[null, 100, 101, 102, 103, 87, 999, 104, 88, 105, 89]

        Collection<String> myValues = hm1.values(); //this will return collection for all values
        System.out.println(myValues);//[Kemal, A, Veli, Can,  Canan, K, Z, null, L, null, M]

        //If you want to convert Map to a collection, use entrySet().
        Set<Map.Entry<Integer,String>> setFormMap = hm1.entrySet();//every element called entry has different structure
        System.out.println(setFormMap);


        for(Map.Entry<Integer,String> w : setFormMap){
//            System.out.println(w);
//            System.out.println(w.getKey());
//            System.out.println(w.getValue());
            System.out.println("Key: " + w.getKey() +" Value: " + w.getValue());
        }

    }

}
