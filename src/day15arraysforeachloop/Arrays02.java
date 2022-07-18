package day15arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

        //Correct Solution 1:
        //Check if the array elements are in natural order.
        //"A" - "B" - "C" => natural order
        //"A" - "C" - "B" => not natural order
        String srr [] = {"Ayhan", "Ceyhan", "Beyhan"};
        System.out.println(Arrays.toString(srr));
        //Create a new array and put the elements into the new array
        //If you want keep original array same, transfer elements one by one by using for loop. You will have same elements in 2 different reserved area
        String trr [] = new String[3];
        for(int i = 0; i<3 ; i++){
            trr[i] = srr[i];
        }

        Arrays.sort(trr);

        if(Arrays.equals(srr,trr)){
            System.out.println("**** Natural order *****");
        } else {
            System.out.println("**** Not natural order ******");
        }




        //Correct solution 2:
        String mrr [] =  {"Ayhan", "Ceyhan", "Beyhan"};
        System.out.println(Arrays.toString(mrr));
        //If you want to keep original array same, use copyOf() method
        //By using copyOf() method you will have same elements in 2 different reserved are.

        String nrr [] = Arrays.copyOf(mrr,2);
        System.out.println("==>" + Arrays.toString(nrr));

        Arrays.sort(nrr);

        if(Arrays.equals(mrr,nrr)){
            System.out.println("===Natural Order===");
        } else {
            System.out.println("====Not natural order===");
        }




        //Wrong solution:
        //Check if the array elements are in natural order.
        //"A" - "B" - "C" => natural order
        //"A" - "C" - "B" => not natural order
        String urr [] = {"Ayhan", "Ceyhan", "Beyhan"};
        System.out.println(Arrays.toString(urr));
        //If you assign an array into another array they will use same reserved area, Do not forget this!!
        String prr [] = urr;
        Arrays.sort(prr);
        if(Arrays.equals(urr,prr)){
            System.out.println("Natural order..");
        } else {
            System.out.println("Not natural order..");
        }






    }

}
