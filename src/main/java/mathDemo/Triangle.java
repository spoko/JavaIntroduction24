package mathDemo;

public class Triangle {
    public static void main(String[] args) {
        System.out.println(calculateAreaOfTriangleByTwoSideAndAngle(3,4,90));


    }

    public static double calculateAreaOfTriangleByTwoSideAndAngle(int a, int b, double angle){
        return a * b * 0.5 * Math.sin(Math.toRadians(angle));
    }
}
