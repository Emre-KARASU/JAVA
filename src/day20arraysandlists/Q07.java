package day20arraysandlists;

public class Q07 {

    public static void main(String[] args) {

        /*
         * Type a code that calculates the average value of array elements
         *
         * input[]= {1,2,3,4,5,6,7}   average ==> sum of elements / number of elements
         * Output : 4                 number of elements ==> length of array
         */

        int array [] = {1, 2, 3, 4, 5, 6}; // sum ==> 28; 28/7 = 4
//                                         3.5
        double sum = 0;

        if(array.length == 0){
            System.out.println("Hey user! I can not calculate the average of an empty array..");
        } else {

            for(int w : array){
                sum = sum + w;
            }
            double average = sum / array.length;
            System.out.println("The average: " + average);
        }
    }
}
