import classes.Animal;
import classes.Groceries;
import classes.Vehicle;
import classes.Cat;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal( "Dog",4, 2,"Omnivore","Land");
        Groceries groceries = new Groceries();
        Vehicle vehicle = new Vehicle();

        Cat cat = new Cat();
        cat.animalSound();

    }
}
