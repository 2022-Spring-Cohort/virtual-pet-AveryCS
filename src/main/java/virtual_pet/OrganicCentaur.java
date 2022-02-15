package virtual_pet;

public class OrganicCentaur extends Centaur{

    private int needCleaningLevel;
    public OrganicCentaur(String name, String superPower, int age, int restLevel, int boredomLevel, int hungerLevel, int thirstLevel, String hoofShape) {
        super(name, superPower, age, restLevel, boredomLevel, hungerLevel, thirstLevel, hoofShape);

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
    public void walkPet() {
        needCleaningLevel --;
    }

    @Override
    public boolean canKeepPlaying() {
        return super.canKeepPlaying() && getNeedCleaningLevel() <= 10;
    }


    @Override
    public void playMethod() {
        super.playMethod();
        needCleaningLevel ++;
    }


    }

