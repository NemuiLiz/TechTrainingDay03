package classes;

public class Bird extends Animal {


    public String getAnimalName() {
        System.out.println("This is " + animalName);
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getRace() {
        System.out.println(animalName + " is a " + race);
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getHabitat() {
        System.out.println(animalName + "'s habitat is on " + habitat);
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public void animalSound() {
        System.out.println("Chirp!");
    }
}
