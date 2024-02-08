package oop;

public abstract class AdditionalPetActions {
    public abstract void move();//abstract method i.e. missing body

    public void eat(){//non-abstract method i.e. have a body:
        System.out.println("Eating...");
    }
}
