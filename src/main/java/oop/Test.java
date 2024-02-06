package oop;

public class Test {
    public static void main(String[] args) {
        Dog sharo = new Dog("", -45.4f, false, true, (byte) -23);
        Dog sharo2 = new Dog();
        Dog pes2 = new Dog("Klara", 34.566f, true, false, (byte) 3);
        //Dog pes2 = new Dog();

        sharo.bark();//capsule of information
        sharo.run();
        sharo.eat();

        sharo.printData();

        pes2.bark();
        pes2.eat();
        pes2.run();
        pes2.printData();
    }
}
