package day07stringmanipulations;

public class Sm02 {

    public static void main(String[] args) {

        String str = "Ali Canan";
        String newStr = str.concat("!...").concat("Congrats...");
        System.out.println(newStr);//Ali Can!...Congrats...
        //You can do concatenation by using + sign, you can use concat() method

        boolean isLast = str.endsWith("Canli");
        System.out.println(isLast);//false

        boolean isFirst = str.startsWith("Al");
        System.out.println(isFirst);

        boolean isFourth = str.startsWith("C",4);
        System.out.println(isFourth);


        /*
        11)concat()
        12)endsWith()
        13)startsWith(with 1 parameter)
        14)startsWith/with 2 parameters)

         */

    }
}
