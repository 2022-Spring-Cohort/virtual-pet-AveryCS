package virtual_pet;

public class RoboticUnicorn extends Unicorn{

    private int needMaintenanceLevel;
    public RoboticUnicorn(String name, String superPower, int age, int restLevel, int boredomLevel, int hungerLevel, int thirstLevel, String hornShape) {
        super(name, superPower, age, restLevel, boredomLevel, hungerLevel, thirstLevel, hornShape);

        this.needMaintenanceLevel = 5;
    }
    @Override
    public void walkPet() {

    }

}
