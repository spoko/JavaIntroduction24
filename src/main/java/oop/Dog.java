package oop;

public class Dog extends Pet{
    //instance variables or characteristics:
    private boolean isGood;

    //Setters and Getters
    public boolean isGood() {
        return isGood;
    }

    public void setGood(boolean good) {
        isGood = good;
    }

    //constructors
    public Dog(String name, float weight, boolean isGood, boolean isMale, byte age, Breed breed){
        super(name, weight, isMale, age, breed);
        this.isGood = isGood;
    }

    //methods - actions/ functions that any future object from this type can do:
    public void bark(){
        System.out.println("Bau, bau!");
    }

    public void run(){
        System.out.println(super.getName() + " is running");
    }

    public void printData(){
        super.printData();
        System.out.println(isDogGood());
    }

    private String isDogGood(){
        if (isGood){
            return " The dog is good.";
        }else {
            return " Bad dog.";
        }
    }

    @Override
    public void move() {
        System.out.println(super.getName() + " is walking...");
    }
}