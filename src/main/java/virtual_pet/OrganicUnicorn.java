package virtual_pet;

public class OrganicUnicorn extends Unicorn{

    private int needCleaningLevel;
    public OrganicUnicorn(String name, String superPower, int age, int restLevel, int boredomLevel, int hungerLevel, int thirstLevel, String hornShape) {
        super(name, superPower, age, restLevel, boredomLevel, hungerLevel, thirstLevel, hornShape);

        this.needCleaningLevel =5;
    }

    public int getNeedCleaningLevel() {
        return needCleaningLevel;
    }

    //this is cleaning the cage of the organic pet
    public int petCare(){
        return needCleaningLevel--;
    }

    @Override
    public boolean canKeepPlaying() {
        return super.canKeepPlaying() && getNeedCleaningLevel() <= 10;
    }
    public void walkPet(){
        needCleaningLevel --;
    }

    @Override
    public void playMethod() {
        super.playMethod();
        needCleaningLevel++;
    }
}
