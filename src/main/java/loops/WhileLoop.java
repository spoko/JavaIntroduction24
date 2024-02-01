package loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        printFactorial(0);
        printFactorial(3);

        System.out.println("Please enter a whole positive number:");
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();

        printFactorial(userNumber);
    }

    public static void printFactorial(int n){
        //local variables
        int factorial = 1;
        int i = 1;

        while (i <= n){
            factorial *= i; //factorial = factorial * i;
            i++;//increment by 1
        }
        System.out.printf("You have entered: %d. The factorial is: %d.\n", n, factorial);
    }
}
