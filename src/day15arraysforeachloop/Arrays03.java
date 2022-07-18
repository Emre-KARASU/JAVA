package day15arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {

        //How to check an element if it exists in array or not
        int arr [] = {32, 14, 2, 11}; //2

        //1.Way:
        for(int w : arr){
            if( w == 2){
                System.out.println(w + " exists..");
                break;
            }
        }


        //2.Way:
        //Notes:
        //1) binarySearch() method returns the index of existing element
        //2) binarySearch() method returns the order number with a negative sign for non-existing elements
        //3)To use binarySearch() method you HAVE TO use sort() method first, Otherwise the output will not be meaningful
        //4) Do not use binarySearch() method for repeating elements, it does not give correct result everytime

        Arrays.sort(arr);//[2, 11, 14, 32]
        System.out.println( Arrays.binarySearch(arr,2) );//0
        System.out.println( Arrays.binarySearch(arr,50) );//-5




    }

}
