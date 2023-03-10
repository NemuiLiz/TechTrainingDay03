package classes;

public class Cat implements AnimalInterface{
    public void animalSound() {
        System.out.println("Cat makes meow!");
    }
    public void isHungry() {
        System.out.println("Cat's stomach is growling!");
    }
    public void feedAnimal() {
        System.out.println("You stuffed food into the cat.");
    }
    public void addRace() {
        System.out.println("You made the cat a Siamese Cat.");
    }
}
