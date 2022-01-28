package virtual_pet;

import java.util.ArrayList;

public class VirtualPetShelter {


    ArrayList<MythicalCreatures> mythicalCreaturesInShelter;

    public VirtualPetShelter() {
        this.mythicalCreaturesInShelter = new ArrayList<>();
    }


    public void addUnicorn(Unicorn myUnicorn) {
        mythicalCreaturesInShelter.add(myUnicorn);
    }

    public void getallMythicalCreatures() {
        for (MythicalCreatures currentCreature : mythicalCreaturesInShelter) {
            System.out.println(currentCreature.getName());
        }
    }

    public void showAllStatus() {
        for (MythicalCreatures currentCreature : mythicalCreaturesInShelter) {
            System.out.println(currentCreature.statusMessage());
        }
    }

    public void feedAll() {
        for (MythicalCreatures currentCreature : mythicalCreaturesInShelter) {
            currentCreature.feedPetMethod();
        }
    }

    public void waterAll() {
        for (MythicalCreatures currentCreature : mythicalCreaturesInShelter) {
            currentCreature.waterPetMethod();
        }
    }

    public void giveRestToAll() {
        for (MythicalCreatures currentCreature : mythicalCreaturesInShelter) {
            currentCreature.giveRestMethod();
        }
    }

    public void playWithAll() {
        for (MythicalCreatures currentCreature : mythicalCreaturesInShelter) {
            currentCreature.playMethod();
        }
    }

    }
