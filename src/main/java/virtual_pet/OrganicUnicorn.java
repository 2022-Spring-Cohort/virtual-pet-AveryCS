package virtual_pet;

public class OrganicUnicorn extends Unicorn{

    private int needCleaningLevel;
    public OrganicUnicorn(String name, String superPower, int age, int restLevel, int boredomLevel, int hungerLevel, int thirstLevel, String hornShape) {
        super(name, superPower, age, restLevel, boredomLevel, hungerLevel, thirstLevel, hornShape);

        this.needCleaningLevel =5;
    }
//The walkpet method was abstract from the superclass. Anything that is abstract has to be passed down, bc it is is the
    //contract. So, you have to add the method, but then you have to kind of define it, aka curlybraces, even though
    //there's nohhing in there.
    public void walkPet(){
    }

}
