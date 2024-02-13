package methods;

public class MethodsDemo {
    public static void main(String[] args) {
        System.out.println(sum(4,5));
        System.out.println(sum(3, 5, 9));

        System.out.println(sum(sum(4,5,12), sum(3, 56)));
        printWeekDay(WeekDays.MONDAY);
    }

    public static int sum(int a, int b){
        return a + b;
    }

    //method overload, came from polymorphism
    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    public static void printWeekDay(WeekDays day){
        System.out.println("The selected day is: " + day);
    }
}
