package oop;

public class Pet extends AdditionalPetActions{
    //instance variables:
    private String name;
    private float weight;
    private boolean isMale;
    private byte age;
    private Breed breed;//composition
    private Address address;//aggregation

    //setters and getters
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

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        if (!breed.equals(null)){
            this.breed = breed;
        }else {
            System.out.println("ERROR: Invalid input for Breed!");
        }
    }

    //constructors
    public Pet(String name, float weight, boolean isMale, byte age, Breed breed){
        setName(name);
        setWeight(weight);
        this.isMale = isMale;
        setAge(age);
        setBreed(breed);
    }

    @Override
    public void move() {
        System.out.println(name + " is moving...");
    }

    public void eat(){
        System.out.println(name + " is eating");
    }

    public void printData(){
        System.out.printf("The name of the dog is: %s. It weights %.2f. %s. It is %d year(s) old.",
                name, weight, isPetMale(), age);
    }

    private String isPetMale(){
        if (isMale){
            return "The pet is male";
        }else {
            return "The pet is female";
        }
    }
}