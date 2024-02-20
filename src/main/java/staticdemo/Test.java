package staticdemo;

public class Test {
    public static void main(String[] args) {
        System.out.println(Car.FOUR_WHEEL_DRIVE);
        System.out.println(Car.getCounter());

        Car car1 = new Car("BMW", 34335.33);

        System.out.println(Car.FOUR_WHEEL_DRIVE);
        System.out.println(Car.getCounter());

        System.out.println(car1.FOUR_WHEEL_DRIVE);
        System.out.println(car1.getCounter());
    }
}
