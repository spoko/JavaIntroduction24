package first.demo;

import java.util.Scanner;

public class FirstDemo {
    public static void main (String [] args){
        //this will print the text in the console
        System.out.println("Please enter your name:");

        //Scanner class has build in methods and ability to read user data from the console
        Scanner scanner = new Scanner(System.in);

        //defining a variable to store the user input
        String userName = scanner.nextLine();

        //this will print the text in the console
        System.out.println("Please enter your age:");

        int userAge = scanner.nextInt();

        //printing final message
        System.out.printf("Hello %s. Nice to meet you! What a wonderful age %d!\n", userName, userAge);
    }
}
