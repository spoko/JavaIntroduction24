package data.types;

public class Dog {
    //instance variables:
    String name;
    float weight;
    boolean isGood;
    boolean isMale;
    byte age;

    public void printData(){
        System.out.println("Name is: " + name);
        System.out.println("Weights: " + weight);
        System.out.println("Is it good dog: " + isGood);
        System.out.println("Is it male: " + isMale);
        System.out.println("Age is: " + age);
    }

    public void printDataFormatted(){
        System.out.printf("The name of the dog is %s. It weights %.2f. The dog is %d years old.\n", name, weight, age);
    }

}
