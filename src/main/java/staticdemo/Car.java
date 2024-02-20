package staticdemo;

public final class Car extends DriveCar {
    private static int counter;
    private double price;
    private String name;

    protected static final boolean FOUR_WHEEL_DRIVE;// = true;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCounter() {
        return counter;
    }

    static {
        System.out.println("Calling static initializer...");
        FOUR_WHEEL_DRIVE = true;
    }

    public Car(String name, double price){
        System.out.println("Calling the constructor");
        setName(name);
        setPrice(price);
        counter++;
        //FOUR_WHEEL_DRIVE = true; not possible since the constructor may not be even called,
        //but the constant shall be possible to be used from the class
    }

    @Override
    public void moveForward(int distance) {
        System.out.println(this.name + " is moving forward " + distance + ".");
    }

    @Override
    public void moveBackwards(int distance) {
        System.out.printf("%s is moving backwards %d", this.name, distance);
    }


    public void beep(){
        System.out.println("Beeeeeeeeep!");
    }

    //not possible to override a final method
//    public void turn(String direction){
//
//    }
}
