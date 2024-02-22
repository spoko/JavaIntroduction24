package mathDemo;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(100));
        System.out.println(random.nextInt(-100, 100));

        int a = random.nextInt(1, 10);
        int b = random.nextInt(1, 10);
        double angle = random.nextDouble(1, 179);

        System.out.printf("Area of triangle with sides a = %d, b=%d and angle=%.2f is %.2f\n", a, b, angle,
                Triangle.calculateAreaOfTriangleByTwoSideAndAngle(a, b, angle));

    }

    public static void printTotoNumbers(int arrayLenght){

    }
}
