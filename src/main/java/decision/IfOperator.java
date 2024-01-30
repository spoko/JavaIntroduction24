package decision;

import java.util.Scanner;

public class IfOperator {
    public static void main(String[] args) {
        System.out.println("PLease enter your age:");
        Scanner scanner = new Scanner(System.in);
        int userAge = scanner.nextInt();

        printUserCategory(userAge);

        System.out.println("Please enter the day of the week:");
        int weekDay = scanner.nextInt();

        printDayOfWeek(weekDay);
        printWeekDaysSwitch(weekDay);
    }

    public static void printUserCategory(int age){
        //0-12 - kid
        //13-19 teenager
        //20-65 adult
        //66 - 120 retired

        if (age < 0 || age > 120){
            System.out.println("ERROR: Invalid Input");
            return;
        }

        if (age >= 0 && age <= 12){
            System.out.println("Welcome kid!");
        }

        if (age >= 13 && age <= 19){
            System.out.println("Wow teenager!");
        }

        if (age >= 20 && age <= 65){
            System.out.println("Sorry you have to work ;(");
        }

        if (age >= 66 && age <= 120){
            System.out.println("Get some deserved rest :)");
        }
    }

    public static void printDayOfWeek(int day){
        if (day < 0 || day > 7){
            System.out.println("ERROR: Invalid Input");
            return;
        }
        if (day == 1){
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6){
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        }
    }

    public static void printWeekDaysSwitch(int dayOfWeek){
        switch (dayOfWeek){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("ERROR: Invalid input");
        }
    }
}
