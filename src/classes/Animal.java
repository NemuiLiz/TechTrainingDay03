package classes;

import java.util.Scanner;

//Object
public abstract class Animal implements AnimalInterface{


    //Fields
    public String animalName;
    public String race;
    public int numberOfLegs = 4;
    public int numberOfEyes = 2;
    public String diet;
    public String habitat;
    public boolean isHungry = true;


    //Default Constructor
    public Animal() {}

    //Constructor with Parameters
    public Animal(String animalName, String diet, String habitat) {
        this.animalName = animalName;
        this.diet = diet;
        this.habitat = habitat;
    }

    //Methoden
    @Override
    public void animalSound() {}

    public void addRace() {}

    //classes.Animal hungry, feed animal
    public void feedAnimal() {
        if(isHungry) {
            isHungry = false;
            System.out.println("Animal has been fed.");
        }
    }

    public void isAnimalHungry() {
            isHungry = !isHungry;
    }

    //getter and setter
    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfEyes() {
        return numberOfEyes;
    }

    public void setNumberOfEyes(int numberOfEyes) {
        this.numberOfEyes = numberOfEyes;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
}
