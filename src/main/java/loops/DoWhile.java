package loops;

public class DoWhile {
    public static void main(String[] args) {
        printPositiveNumbersToN(0);
        System.out.println("---------");
        printPositiveNumbersToN(5);
    }

    public static void printPositiveNumbersToN(int n){
        int start = 0;

        do{
            System.out.println("Current number is: " + start);
            start++;
        } while (start <= n);
    }
}
