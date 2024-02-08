package oop;

public class Cat extends Pet //inheritance
{
    //instance variables:
    private boolean isGoodHunter;

    //setters and getters


    public boolean isGoodHunter() {
        return isGoodHunter;
    }

    public void setGoodHunter(boolean goodHunter) {
        isGoodHunter = goodHunter;
    }

    //constructor
    public Cat(String name, float weight, boolean isMale, byte age, boolean isGoodHunter, Breed breed){
        super(name, weight, isMale, age, breed);
        this.isGoodHunter = isGoodHunter;
    }

    @Override
    public void printData() {
        super.printData();
        System.out.println(isCatGoodHunter());
    }

    private String isCatGoodHunter(){
        if (isGoodHunter){
            return "The cat catches a lot of mice!";
        }else {
            return "The cat eat only at home!";
        }
    }
}
