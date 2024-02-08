package oop;

public class Breed {
    private String name;
    private String characteristics;
    private String possibleIllness;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.isEmpty()){
            this.name = name;
        }else {
            System.out.println("ERROR: Invalid input for breed name!");
        }
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        if(!characteristics.isEmpty()){
            this.characteristics = characteristics;
        }else {
            System.out.println("ERROR: Invalid input for breed characteristics!");
        }
    }

    public String getPossibleIllness() {
        return possibleIllness;
    }

    public void setPossibleIllness(String possibleIllness) {
        if(!possibleIllness.isEmpty()){
            this.possibleIllness = possibleIllness;
        }else {
            System.out.println("ERROR: Invalid input for breed possibleIllness!");
        }
    }

    public Breed(String name, String characteristics, String possibleIllness){
        setName(name);
        setCharacteristics(characteristics);
        setPossibleIllness(possibleIllness);
    }
}
