package virtual_pet;

//this is becoming abstract because a basic centaur will not be used- just robotic or organic
public abstract class Centaur extends MythicalCreatures {
    private String hoofShape;
    public Centaur(String name, String superPower, int age, int restLevel, int boredomLevel, int hungerLevel,
                   int thirstLevel, String hoofShape) {
        super(name, superPower, age, restLevel, boredomLevel, hungerLevel, thirstLevel);
        this.hoofShape = hoofShape;
    }

    public void walkPet() {
    }
}
