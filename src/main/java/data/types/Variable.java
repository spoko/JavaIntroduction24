package data.types;

public class Variable {
    //primitive data types - they will use the Stack memory
    static char symbol = '&';
    static byte age = 120;
    static short salary;
    static int egn;
    static long marsPeakHeight;
    static float weight;
    static double bankBalance;

    //referent data type i.e. stored in the Heap memory
    static String testString = "some random text";

    public static void main(String[] args) {
        //local variables
        String someName = "";
        Dog morti = new Dog();
        Dog sharo = new Dog();

        System.out.println(someName);

        System.out.println(symbol);
        System.out.println(age);
        System.out.println(salary);
        System.out.println(egn);
        System.out.println(marsPeakHeight);
        System.out.println(weight);
        System.out.println(bankBalance);

        System.out.println(testString);
        System.out.println(morti);
        morti.age = 20;
        morti.weight = 14.5f;
        morti.name = "Morti";
        morti.isMale = true;
        morti.isGood = false;

        System.out.println("-----------------");
        morti.printData();
        System.out.println("-----------------");
        sharo.printData();

    }

}
