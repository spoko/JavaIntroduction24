package operators;

public class Logical {
    public static void main(String[] args) {
        int a = 2;
        int b = 7;

        System.out.println(true && true);//true
        System.out.println(true && false);//false
        System.out.println(false && true);//false
        System.out.println(false && false);//false

        System.out.println("------------");

        System.out.println(true || true);//true
        System.out.println(true || false);//true
        System.out.println(false || true);//true
        System.out.println(false || false);//false

        System.out.println("------------");

        System.out.println(!(true || false) && (true && !false));//false

        System.out.println(a < b ? "B is bigger" : "A is bigger or equals");
    }
}
