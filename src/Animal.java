import java.util.Scanner;

//Object
public class Animal {
    //Fields
    String animalName;
    int numberOfLegs;
    int numberOfEyes;
    String diet;
    String habitat;

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



}
