package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException, CookieMonsterSadException {
        //we have try catch block for checked exceptions
        try{
            ReadFile.read("src/main/resources/test.txt");
        }catch (FileNotFoundException e){
            System.out.println("There is no such file! " +
                    "Please make sure that the full path name is correct! " + e.getMessage());
        }catch (IOException e){
            System.out.println("Something bad happened with the file in " + e.getMessage() +
                     " Please make sure the file still exist/ accessible");
        }finally {
            System.out.println("I will be executed always!");
        }

        //we throw checked exception that is not in try catch block
        //ReadFile.read("src/main/resources/4test.txt");

        //example of runtime exception i.e. unchecked:
        System.out.println("Please enter number a");

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        System.out.println("Please enter number b");

        int b = scanner.nextInt();

        try {
            System.out.println("The result is: " + a/b);
        } catch (ArithmeticException e){
            throw new CookieMonsterSadException(e.getMessage(), a);
        }
    }
}
