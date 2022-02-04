package virtual_pet;

public class OrganicCentaur extends Centaur{

    private int needCleaningLevel;
    public OrganicCentaur(String name, String superPower, int age, int restLevel, int boredomLevel, int hungerLevel, int thirstLevel, String hoofShape) {
        super(name, superPower, age, restLevel, boredomLevel, hungerLevel, thirstLevel, hoofShape);

        this.needCleaningLevel =5;
    }


}
