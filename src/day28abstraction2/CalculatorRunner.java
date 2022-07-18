package day28abstraction2;

public class CalculatorRunner {

    public static void main(String[] args) {

      Calculator calculator1 = new Profit();
        System.out.println(calculator1.addition(2,3));//5
        System.out.println(calculator1.multiplication(2,3));//6
        System.out.println(calculator1.substraction(5,9));//-1
        System.out.println(calculator1.division(6,3));//-1

        System.out.println("==============================");

        Calculator calculator2 = new Loss();
        System.out.println(calculator2.addition(2,3));//-1
        System.out.println(calculator2.multiplication(2,3));//-1
        System.out.println(calculator2.substraction(5,3));//2
        System.out.println(calculator2.division(9,3));//3
        System.out.println(calculator2.division(1,0));


    }
}
