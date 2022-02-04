package virtual_pet;

public class RoboticCentaur extends Centaur{

    private int needMaintenanceLevel;

    public RoboticCentaur(String name, String superPower, int age, int restLevel, int boredomLevel, int hungerLevel, int thirstLevel, String hoofShape) {
        super(name, superPower, age, restLevel, boredomLevel, hungerLevel, thirstLevel, hoofShape);

        this.needMaintenanceLevel = 5;
    }

//    -Overriding the walk method from the superclass (when walked, need for cage cleaning goes down)


}
