package classes;

import java.util.Scanner;

//Object
public class Animal {
    //Fields
    public String animalName;
    public int numberOfLegs;
    public int numberOfEyes;
    public String diet;
    public String habitat;
    public boolean isHungry;

    //Constructor
    public Animal(String animalName, int numberOfLegs, int numberOfEyes, String diet, String habitat) {
        this.animalName = animalName;
        this.numberOfLegs = numberOfLegs;
        this.numberOfEyes = numberOfEyes;
        this.diet = diet;
        this.habitat = habitat;
    }


    public String addRace() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an animal Name : ");
        animalName = scanner.nextLine();
        return animalName;
    }

    //classes.Animal hungry, feed animal
    public void feedAnimal() {

    }



}
