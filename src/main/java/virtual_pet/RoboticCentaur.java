package virtual_pet;

public class RoboticCentaur extends Centaur{

    private int needMaintenanceLevel;

    public RoboticCentaur(String name, String superPower, int age, int restLevel, int boredomLevel, int hungerLevel, int thirstLevel, String hoofShape) {
        super(name, superPower, age, restLevel, boredomLevel, hungerLevel, thirstLevel, hoofShape);

        this.needMaintenanceLevel = 5;
    }

    public int getNeedMaintenanceLevel() {
        return needMaintenanceLevel;
    }


    public int giveMaintenance(){
        return needMaintenanceLevel--;
    }

    //    -Overriding the walk method from the superclass (when walked, need for cage cleaning goes down)


    @Override
    public void walkPet() {
        needMaintenanceLevel++;
    }

    //this is giving oil and maintenance to the robotic pet
    @Override
    public int petCare(){
        return needMaintenanceLevel--;
    }

    @Override
    public boolean canKeepPlaying() {
        return super.canKeepPlaying() && getNeedMaintenanceLevel() <= 10;
    }

    //I want something in the game to counteract the needMaintenanceLevel going up. So, I am going to override the
    //play method that comes from the super class. So that the more you play with robotic stuff,
    // the needMaintenanceLevel will increase

    @Override
    public void playMethod() {
        super.playMethod();
        needMaintenanceLevel --;
    }

    }

