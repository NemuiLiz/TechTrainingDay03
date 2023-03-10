import classes.Cat;
import classes.Dog;
import classes.Cow;
import classes.Bird;
import classes.Fish;

public class Main {

    public static void main(String[] args) {

        //Animal animal = new Animal();

        Cat cat = new Cat();
        cat.setAnimalName("Detlef");
        cat.getAnimalName();
        cat.setRace("siamese cat");
        cat.getRace();
        cat.setHabitat("land");
        cat.getHabitat();
        cat.animalSound();

        System.out.println("------------------------------------");

        Dog dog = new Dog();
        dog.setAnimalName("Rudi");
        dog.getAnimalName();
        dog.setRace("Dachshund");
        dog.getRace();
        dog.setHabitat("land");
        dog.getHabitat();
        dog.animalSound();

        System.out.println("------------------------------------");

        Cow cow = new Cow();
        cow.setAnimalName("Moo-lan");
        cow.getAnimalName();
        cow.setRace("burger cow");
        cow.getRace();
        cow.setHabitat("grill");
        cow.getHabitat();
        cow.animalSound();

        System.out.println("------------------------------------");

        Bird bird = new Bird();
        bird.setAnimalName("Hansi");
        bird.getAnimalName();
        bird.setRace("Budgie");
        bird.getRace();
        bird.setHabitat("air");
        bird.getHabitat();
        bird.animalSound();

        System.out.println("------------------------------------");

        Fish fish = new Fish();
        fish.setAnimalName("Dory");
        fish.getAnimalName();
        fish.setRace("Blue Hippo Tang");
        fish.getRace();
        fish.setHabitat("water");
        fish.getHabitat();
        fish.animalSound();
    }
}
