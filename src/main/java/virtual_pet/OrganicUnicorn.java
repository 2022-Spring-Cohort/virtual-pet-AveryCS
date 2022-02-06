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

    //The walkpet method was abstract from the superclass. Anything that is abstract has to be passed down, bc it is is the
    //contract. So, you have to add the method, but then you have to kind of define it, aka curly braces, even though
    //there's nohhing in there.
    public void walkPet(){
        needCleaningLevel --;
    }

    @Override
    public void playMethod() {
        super.playMethod();
        needCleaningLevel++;
    }
}
