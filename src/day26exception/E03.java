package day26exception;

public class E03 {

    public static void main(String[] args) {

        String str = "";
        getNumOfCharactersInAString(str);//0

        String s = "Ali Can";
        getNumOfCharactersInAString(s);//7

        String t = null;
        getNumOfCharactersInAString(t);//NullPointerException

    }

    public static void getNumOfCharactersInAString(String str){
       try {
           System.out.println(str.length());
       } catch (NullPointerException e){                                                         //null
           System.out.println("Issue occurred when I want to count the number of characters " + e.getMessage());
           e.printStackTrace(); //If you want to see details about the issue, you can use e.printStackTrace()
       }
    }
}
