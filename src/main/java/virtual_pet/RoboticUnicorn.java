package virtual_pet;

public class RoboticUnicorn extends Unicorn{

    private int needMaintenanceLevel;
    public RoboticUnicorn(String name, String superPower, int age, int restLevel, int boredomLevel, int hungerLevel, int thirstLevel, String hornShape) {
        super(name, superPower, age, restLevel, boredomLevel, hungerLevel, thirstLevel, hornShape);



        this.needMaintenanceLevel = 5;
    }

    public int getNeedMaintenanceLevel() {
        return needMaintenanceLevel;
    }

    //this is giving oil and maintenance to the robotic pet
   @Override
    public int petCare(){
        return needMaintenanceLevel--;
    }

    @Override
    public void walkPet() {
        needMaintenanceLevel++;

    }

    @Override
    public boolean canKeepPlaying() {
        return super.canKeepPlaying() && getNeedMaintenanceLevel() <= 10;
    }



    @Override
    public void playMethod() {
        super.playMethod();
        needMaintenanceLevel --;
    }

}
