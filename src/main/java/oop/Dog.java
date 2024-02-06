package oop;

public class Dog {
    //instance variables or characteristics:
    private String name;
    private float weight;
    private boolean isGood;
    private boolean isMale;
    private byte age;

    //Setters and Getters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        }else {
            System.out.println("ERROR: Invalid input for name - empty string!");
        }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight > 0){
            this.weight = weight;
        }else {
            System.out.println("ERROR: Invalid input for weight - " + weight);
        }
    }

    public boolean isGood() {
        return isGood;
    }

    public void setGood(boolean good) {
        isGood = good;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        if (age >= 0){
            this.age = age;
        }else {
            System.out.println("ERROR: Invalid input for age - " + age);
        }
    }

    //constructors
    public Dog(String name, float weight, boolean isGood, boolean isMale, byte age){
        setName(name);
        setWeight(weight);
        this.isGood = isGood;
        this.isMale = isMale;
        setAge(age);
    }

    public Dog(){

    }
    //methods - actions/ functions that any future object from this type can do:
    public void bark(){
        System.out.println("Bau, bau!");
    }

    public void run(){
        System.out.println(name + " is running");
    }

    public void eat(){
        System.out.println(name + " is eating");
    }

    public void printData(){
        System.out.printf("The name of the dog is: %s. It weights %.2f. %s. %s. It is %d year(s) old.",
                name, weight, isDogGood(), isDogMale(), age);
    }

    private String isDogGood(){
        if (isGood){
            return "The dog is good ";
        }else {
            return "Bad dog";
        }
    }

    private String isDogMale(){
        if (isMale){
            return "The dog is male";
        }else {
            return "The dog is female";
        }
    }
}
