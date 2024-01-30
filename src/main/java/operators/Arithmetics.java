package operators;

public class Arithmetics {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        System.out.println(a + b);//7
        System.out.println(a - b);//3
        System.out.println(a * b);//10
        System.out.println((float) a / b);//2
        System.out.println(a % b);//0

        System.out.println("----------");
        System.out.println(++a);//6
        System.out.println(a);

        System.out.println("----------");

        System.out.println(b++);//2
        System.out.println(b);//3

        System.out.println("----------");

        System.out.println(a == b);//false can be used for primitive data types
        System.out.println(a > b);//true
        System.out.println(a < b);//false
        System.out.println(a != b);//true
    }
}
