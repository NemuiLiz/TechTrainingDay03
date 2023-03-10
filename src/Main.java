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
        cow.setRace("burger cow");
        cow.setHabitat("grill");
        cow.setAnimalSound("Moo!");
        System.out.println(cow);

        System.out.println("------------------------------------");

        Bird bird = new Bird();
        bird.setAnimalName("Hansi");
        bird.setRace("Budgie");
        bird.setHabitat("air");
        bird.setAnimalSound("Chirp!");
        System.out.println(bird);

        System.out.println("------------------------------------");

        Fish fish = new Fish();
        fish.setAnimalName("Dory");
        fish.setRace("Blue Hippo Tang");
        fish.setHabitat("water");
        fish.setAnimalSound("Blubb!");
        System.out.println(fish);
        fish.feedHungryAnimal();
    }
}
