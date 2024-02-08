package oop;

public class Test {
    public static void main(String[] args) {
        Breed frenchBulldog = new Breed("French bulldog", "Playfull and lazy",
                "Stomach illness");
        Breed ragDoll = new Breed("Rag Doll", "Long fur", "blah");

        Dog sharo = new Dog("Klara", 34.566f, true, false, (byte) 3, frenchBulldog);
        sharo.bark();//capsule of information
        sharo.run();
        sharo.eat();
        sharo.printData();

        Cat pisan = new Cat("Pisan", 4.25f, true, (byte) 2, true, ragDoll);
        pisan.eat();
        pisan.printData();
    }
}
