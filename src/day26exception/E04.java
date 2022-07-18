package day26exception;

public class E04 {

    public static void main(String[] args) {

    String str = "123";
    convertToStringToInteger(str);//124

    String s = "123a";
    convertToStringToInteger(s);//NumberFormatException ==> For input string: "123a"

//        Integer.valueOf() ==> Integer
//        Integer.parseInt() ==> int
    }

    public static void convertToStringToInteger(String str){
        try {
            System.out.println(Integer.parseInt(str) + 1);
        } catch (NumberFormatException e){
            System.err.println("String could not be converted to an int ==> " + e.getMessage());
        }
    }
}
