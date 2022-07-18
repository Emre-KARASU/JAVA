package day27exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E03 {
    /*
    Note 1: When you type code, Java will give red underline for some Exceptions before running the code.
          That exceptions are called "Compile Time Exceptions" (Checked exception)

          1)FileNotFoundException:This exception is thrown if the path is wrong or the file is deleted.
          2)IOException: This exception handles all issues related with Input and Output

          Note a: "FileNotFoundException" is the child of  "IOException"
          Note b: If there is parent-child relationship between Exception classes, Child Exception Class must come before
                  Parent Exception Class in multiple catch-block usage.
          Note c: To execute a code block under every-condition, put the codes inside the finally block.


     Note 2: a)try-block cannot be used alone
             b)try-block can be used with a single catch block
             c)try-block can be used with a multiple catch block
             d)try-block can be used with just finally block
             e)try-block can be used with a single or multiple catch block and finally block

       Exception e
     */

    public static void main(String[] args) {
        goAndReadTheFile();
    }

    public static void goAndReadTheFile(){
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\tugba\\eclipse-workspace\\.metadata\\winter2022java\\src\\day27exception\\File01.txt");
            int k = 0;
            while( (k = fis.read()) != -1){
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("There is an issue about reaching file or existance of file.." + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Connection was broken..");
        }
    }
}
