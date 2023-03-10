package classes;

public class Fish extends Animal {

    @Override
    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    @Override
    public String getAnimalName() {
        System.out.println("This is " + animalName);
        return animalName;
    }

    @Override
    public void animalSound() {
        System.out.println("Blubb!");
    }

    @Override
    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public String getRace() {
        System.out.println(animalName + " is a " + race);
        return race;
    }

    @Override
    public void isAnimalHungry() {
        isHungry = false;
    }

    @Override
    public String getDiet() {
        return diet;
    }

    @Override
    public void setDiet(String diet) {
        this.diet = diet;
    }

    @Override
    public String getHabitat() {
        System.out.println(animalName + " is a " + habitat + " animal");
        return habitat;
    }

    @Override
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
