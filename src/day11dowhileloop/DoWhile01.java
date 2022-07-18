package day11dowhileloop;

public class DoWhile01 {

    public static void main(String[] args) {

        //What is the difference between while loop and do while loop? (Interview Question)

        //In while loop sometimes the codes inside the body are not executed.
        //It means zero execution is possible in while loop

        int i = 1;
        while (i<1){
            System.out.println("Hello!");    //Think first then execute
            i++;
        }


        //do-while loop
        //in do while loop the codes-inside the body are executed at least once
        //It means zero execution is not possible

        int k = 1;

        do{
            System.out.println("Hello!");   // Do first, then check the condition

          k++;
        }while (k<1);

    }

}
