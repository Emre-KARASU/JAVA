package day27exception;

public class E01 {

    public static void main(String[] args) {
        /*
        1) You can use multiple catch blocks with a try block
        2) When you use multiple catch blocks just one of them can be executed at the same
        3) try-block cannot be used alone.
         */

        String s = "Hello!";
//        getCharacterFromAStringByIndex(s,2);//l
//        getCharacterFromAStringByIndex(s,6);//StringIndexOutOfBoundsException => String index out of range: 6
        divideTheLengths(s,1,5,3); // 2
        System.out.println("=======================================");
        divideTheLengths(s,1,7,3);//StringIndexOutOfBoundsException
        System.out.println("=======================================");
        divideTheLengths(s,1,5,1); //ArithmeticException
        System.out.println("=======================================");
        divideTheLengths(s,1,7,1); //An issue occurred in character selection ==> begin 1, end 7, length 6
    }

    public static void getCharacterFromAStringByIndex(String str, int idx){
        try {
            System.out.println(str.charAt(idx));
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("An issue occurred in character selection ==> " + e.getMessage());
        }
    }

    public static void divideTheLengths(String str, int idx1, int idx2, int idx3) {
        try {
            int firstLength = str.substring(idx1, idx2).length();
            int secondLength = str.substring(idx1, idx3).length();
            System.out.println(firstLength / secondLength);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("An issue occurred in character selection ==> " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("An issue occurred in division==> " + e.getMessage());

        }

    }
}
