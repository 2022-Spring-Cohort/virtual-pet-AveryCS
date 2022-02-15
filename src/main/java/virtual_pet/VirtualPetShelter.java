package virtual_pet;

import java.util.ArrayList;
import java.util.Scanner;

public class VirtualPetShelter {
    Scanner scanner = new Scanner(System.in);


    static ArrayList<MythicalCreatures> mythicalCreaturesInShelter;

    public VirtualPetShelter() {
        this.mythicalCreaturesInShelter = new ArrayList<>();
    }


    public void addUnicorn(Unicorn myUnicorn) {
        mythicalCreaturesInShelter.add(myUnicorn);
    }

    public void addCentaur(Centaur myCentaur) {
        mythicalCreaturesInShelter.add(myCentaur);
    }

    //this method addnewUnicorn allows you to add either a robotic or organic unicorn to the shelter from user input. Yay!
    public Unicorn addNewUnicorn() {
        System.out.println("What's your unicorn name?");
        Scanner scanner = new Scanner(System.in);
        String newName = scanner.nextLine();

        System.out.println("What's your unicorn's superpower?");
        scanner = new Scanner(System.in);
        String newSuperPower = scanner.nextLine();

        System.out.println("How old is your unicorn?");
        scanner = new Scanner(System.in);
        int newAge = scanner.nextInt();

        System.out.println("What's your unicorn's horn shape?");
        scanner = new Scanner(System.in);
        String newHornShape = scanner.nextLine();

        System.out.println("Is your pet organic or robotic? Press 1 for robotic. Press 2 for organic");
        scanner = new Scanner(System.in);
        int organicOrRobotic = scanner.nextInt();

        if (organicOrRobotic == 1) {

            RoboticUnicorn newRoboticUnicorn = new RoboticUnicorn(newName, newSuperPower, newAge, 5, 5, 5, 5, newHornShape);
            mythicalCreaturesInShelter.add(newRoboticUnicorn);

            System.out.println("\n \nDon't worry, your robotic unicorn " + newRoboticUnicorn.getName() + " will be well taken care of at the shelter!\n \n");

            return newRoboticUnicorn;
        } else if (organicOrRobotic == 2) {
            OrganicUnicorn newOrganicUnicorn = new OrganicUnicorn(newName, newSuperPower, newAge, 5, 5, 5, 5, newHornShape);
            System.out.println("\n \nDon't worry, your organic unicorn " + newOrganicUnicorn.getName() + "will be well taken care of at the shelter!\n \n");
            return newOrganicUnicorn;

        } else {
            OrganicUnicorn newOrganicUnicorn = new OrganicUnicorn(newName, newSuperPower, newAge, 5, 5, 5, 5, newHornShape);
            System.out.println("\n \n You did not choose 1 or 2, so we made your unicorn organic. Don't worry, your organic unicorn " + newOrganicUnicorn.getName() + "will be well taken care of at the shelter!\n \n");
            return newOrganicUnicorn;

        }
    }


    public Centaur addNewCentaur() {
        System.out.println("What's your centaur's name?");
        Scanner scanner = new Scanner(System.in);
        String newName = scanner.nextLine();

        System.out.println("What's your centaur's superpower?");
        scanner = new Scanner(System.in);
        String newSuperPower = scanner.nextLine();

        System.out.println("How old is your centaur?");
        scanner = new Scanner(System.in);
        int newAge = scanner.nextInt();

        System.out.println("What's your centaur's hoof shape?");
        scanner = new Scanner(System.in);
        String newHoofShape = scanner.nextLine();

        System.out.println("Is your pet organic or robotic? Press 1 for robotic. Press 2 for organic");
        scanner = new Scanner(System.in);
        int organicOrRobotic = scanner.nextInt();

        if (organicOrRobotic == 1) {

            RoboticCentaur newRoboticCentaur = new RoboticCentaur(newName, newSuperPower, newAge, 5, 5, 5, 5, newHoofShape);
            mythicalCreaturesInShelter.add(newRoboticCentaur);

            System.out.println("\n \nDon't worry, your robotic unicorn " + newRoboticCentaur.getName() + "will be well taken care of at the shelter!\n \n");

            return newRoboticCentaur;
        } else if (organicOrRobotic == 2) {
            OrganicCentaur newOrganicCentaur = new OrganicCentaur(newName, newSuperPower, newAge, 5, 5, 5, 5, newHoofShape);
            System.out.println("\n \nDon't worry, your organic unicorn " + newOrganicCentaur.getName() + "will be well taken care of at the shelter!\n \n");
            return newOrganicCentaur;

        } else {
            OrganicCentaur newOrganicCentaur = new OrganicCentaur(newName, newSuperPower, newAge, 5, 5, 5, 5, newHoofShape);
            System.out.println("\n \nDon't worry, your organic unicorn " + newOrganicCentaur.getName() + " will be well taken care of at the shelter!\n \n");
            return newOrganicCentaur;
        }
    }


    public void adoptMythicalCreature() {
        System.out.println("There are currently " + mythicalCreaturesInShelter.size() + " mythical creatures to adopt. See the list below:");
        for (MythicalCreatures creatures : mythicalCreaturesInShelter)
            System.out.println(creatures.getName());
        //scanner brings in the user input
        scanner = new Scanner(System.in);


        String adoptedMythicalCreature = scanner.nextLine();
        MythicalCreatures chosenPet = null;


        for (MythicalCreatures currentCreature : mythicalCreaturesInShelter) {
            if (currentCreature.getName().equalsIgnoreCase(adoptedMythicalCreature)) {
                chosenPet = (MythicalCreatures) currentCreature;
            }
        }
        if (chosenPet != null) {
            mythicalCreaturesInShelter.remove(chosenPet);
            System.out.println("\n \nCongratulations! You have now adopted " + chosenPet.getName() + "!\n \n");
        }
        else {
            System.out.println("The pet you chose is not in the shelter. Please check the spelling and choose another pet");
        }

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

    public void walkAllUnicorns() {
        for (MythicalCreatures currentUnicorn : mythicalCreaturesInShelter) {
            if (currentUnicorn instanceof Unicorn) {
                currentUnicorn.walkPet();
            }
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
