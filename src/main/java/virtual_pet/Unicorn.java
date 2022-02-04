package virtual_pet ;

public abstract class Unicorn extends MythicalCreatures {
    //I am making this abstract because the basic Unicorn is no longer being used. Basically, everything needed
    //for the game is either going to be a organic or robotic Unicorn

    private String hornShape;

    public Unicorn(String name, String superPower, int age, int restLevel, int boredomLevel,
                   int hungerLevel, int thirstLevel, String hornShape) {
         super(name, superPower, age, restLevel, boredomLevel, hungerLevel, thirstLevel);
        this.hornShape = hornShape;
    }
    public void walkPet() {
    }
}


























