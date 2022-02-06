package virtual_pet;

import java.awt.*;
import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {

        VirtualPetShelter mythicalCreatureShelter = new VirtualPetShelter();

        //Because I made the Unicorn class abstract, I now need to define whether the new instances that I make are
        //robotic or organic. So instead of just making a new Unicorn, I specify which one it is
        OrganicUnicorn ozymandias = new OrganicUnicorn("Ozymandias", "invisibility", 12, 5, 5, 5, 5, "spiral");
        OrganicUnicorn ravery = new OrganicUnicorn("Ravery", "speaking to every living thing", 200, 5, 5, 5, 5, "tongue");
        OrganicUnicorn maisley = new OrganicUnicorn("Maisley", "living underwater", 8, 5, 5, 5, 5, "fish");
        OrganicUnicorn juniper = new OrganicUnicorn("Juniper", "making her 3D printed things come to life", 37, 5, 5, 5, 5, "tv");
        RoboticUnicorn codycode = new RoboticUnicorn("Codycode", "building software on the spot", 99, 5, 5, 5, 5, "laptop");
        RoboticUnicorn atlas = new RoboticUnicorn("Atlas", "being able to go around the world in 10 seconds or less", 53, 5, 5, 5, 5, "globe");
        RoboticUnicorn pauletta = new RoboticUnicorn("Pauletta", "being able to solve any math problem instantly", 32, 5, 5, 5, 5, "calculator");
        RoboticUnicorn shardude = new RoboticUnicorn("Shardude", "being able to play any musical instrument in the world", 94, 5, 5, 5, 5, "guitar");
        RoboticCentaur bennifer = new RoboticCentaur("Bennifer", "being able to snowplow a mile in 1 second", 102, 5, 5, 5, 5, " a snowflake");
        RoboticCentaur boga = new RoboticCentaur("Boga", "being able to speak backwards, while coaching football, painting, and saving the world", 30, 5, 5, 5, 5, "the state of Alabama");
        OrganicCentaur lark = new OrganicCentaur("Lark", "being able to disappear into a suitcase", 478, 5, 5, 5, 5, "the state of Georgia");
        OrganicCentaur wrevenia = new OrganicCentaur("Wrevenia", "making the best meals in the world", 83, 5, 5, 5, 5, "the Eastern Star");

        mythicalCreatureShelter.addUnicorn(ozymandias);
        mythicalCreatureShelter.addUnicorn(ravery);
        mythicalCreatureShelter.addUnicorn(maisley);
        mythicalCreatureShelter.addUnicorn(juniper);
        mythicalCreatureShelter.addUnicorn(codycode);
        mythicalCreatureShelter.addUnicorn(atlas);
        mythicalCreatureShelter.addUnicorn(pauletta);
        mythicalCreatureShelter.addUnicorn(shardude);
        mythicalCreatureShelter.addCentaur(bennifer);
        mythicalCreatureShelter.addCentaur(boga);
        mythicalCreatureShelter.addCentaur(lark);
        mythicalCreatureShelter.addCentaur(wrevenia);


        System.out.println("Welcome to Virtual Pet land! To get started, please type the number that represents your favorite " +
                "color. \n 1- red \n 2- orange \n 3- blue \n 4- green \n 5- purple \n 6-black \n 7- pink \n 8-turquoise" +
                "\n 9-yellow \n 10-brown \n 11-rust \n 12-gray \n 13-My favorite color is not listed.");

        Scanner userInput = new Scanner(System.in);

        String userFavColor = userInput.nextLine();

        String greeting;
        MythicalCreatures userPet;
        switch (userFavColor.trim().toLowerCase()) {
            case "1":
                greeting = ozymandias.greeting();
                userPet = ozymandias;
                break;
            case "2":
                greeting = ravery.greeting();
                userPet = ravery;
                break;
            case "3":
                greeting = maisley.greeting();
                userPet = maisley;
                break;
            case "4":
                greeting = juniper.greeting();
                userPet = juniper;
                break;
            case "5":
                greeting = codycode.greeting();
                userPet = codycode;
                break;
            case "6":
                greeting = atlas.greeting();
                userPet = atlas;
                break;
            case "7":
                greeting = pauletta.greeting();
                userPet = pauletta;
                break;

            case "8":
                greeting = shardude.greeting();
                userPet = shardude;
                break;

            case "9":
                greeting = bennifer.greeting();
                userPet = bennifer;
                break;

            case "10":
                greeting = boga.greeting();
                userPet = boga;
                break;

            case "11":
                greeting = lark.greeting();
                userPet = lark;
                break;

            case "12":
                greeting = wrevenia.greeting();
                userPet = wrevenia;
                break;

            case "13":
                greeting = shardude.greeting();
                userPet = shardude;
                break;

            default:
                greeting = shardude.greeting();
                userPet = shardude;
                break;

        }



        if (userPet instanceof Unicorn) {

            System.out.println(userPet.greeting());
            userPet.asciiPet();


        } else {
            System.out.println(userPet.greeting());
            userPet.asciiPet();
        }


        String instructions = "\nPress the corresponding key to perform these actions with your pet: \n1- Get status of " +
                "your pet \n2- Feed  \n3- Give water \n4- Give rest \n5- Play with your pet \n \nOR, would you like to hang" +
                "out with ALL of the creatures in the shelter?\n \nIf so, see the selections below: " +
                "\n\nA- Get status (of ALL pets) \nB- Feed (ALL pets)  \nC- Give water (to ALL pets) \nD- Give rest (to ALL pets)" +
                " \nE- Play (with ALL pets) \n\n OR see the following: \nF- See which pets are currently in the shelter" +
                "\nG-Adopt a pet \nH- Add a pet \nI-Walk your pet \nJ-Clean your pet's cage/ give it oil \nK-Walk all unicorns";

        System.out.println(instructions);

        String proceedMessage = "How would you like to proceed?";
        System.out.println(proceedMessage);

        String userSelection = userInput.nextLine();


        while (userPet.canKeepPlaying() == true) {

            if (userSelection.trim().equals("1")) {
                System.out.println(userPet.statusMessage());

            } else if (userSelection.trim().equals("2")) {
                userPet.tickMethod();
                userPet.feedPetMethod();
                System.out.println("Message from " + userPet.getName() +": That was a great meal, yum");

            } else if (userSelection.trim().equals("3")) {
                userPet.tickMethod();
                userPet.waterPetMethod();
                System.out.println("Message from " + userPet.getName() +": That water was so refreshing! Thanks!");
            } else if (userSelection.trim().equals("4")) {
                userPet.tickMethod();
                userPet.playMethod();
                System.out.println("Message from " + userPet.getName() +": Aww man, do I have to take a nap?...I guess it's for the best");
            } else if (userSelection.trim().equals("5")) {
                userPet.tickMethod();
                userPet.playMethod();
                System.out.println("Message from " + userPet.getName() +": that was so much fun! I love to play.");
            } else if (userSelection.trim().equalsIgnoreCase("A")) {
                mythicalCreatureShelter.showAllStatus();
            } else if (userSelection.trim().equalsIgnoreCase("B")) {
                mythicalCreatureShelter.feedAll();
                System.out.println("\n \nThanks for giving us all something to eat! We can't wait until the next meal!\n \n");
            } else if (userSelection.trim().equalsIgnoreCase("C")) {
                mythicalCreatureShelter.waterAll();
                System.out.println("\n \nThanks for giving us all something to drink!\n \n");
            } else if (userSelection.trim().equalsIgnoreCase("D")) {
                mythicalCreatureShelter.giveRestToAll();
                System.out.println("\n \nNaptime for us :( \n \n");
            } else if (userSelection.trim().equalsIgnoreCase("E")) {
                mythicalCreatureShelter.playWithAll();
                System.out.println("\n \nWe had such a great time playing with all our friends \n \n");
                System.out.println("\n \nWe had fun flying with our friends! Thanks for taking us to play!\n \n");
            } else if (userSelection.trim().equalsIgnoreCase("F")) {
                System.out.println("\n \nHere's who's left in the shelter at this time: \n");
                mythicalCreatureShelter.getallMythicalCreatures();
            } else if (userSelection.trim().equalsIgnoreCase("G")) {
                mythicalCreatureShelter.adoptUnicorn();
                System.out.println();
            } else if (userSelection.trim().equalsIgnoreCase("H")) {
                System.out.println("Great! Who would you like to check in to the shelter today?\nPress 1 if you'd like to add a centaur \nPress 2 if you'd like to add a unicorn");
                String userSelectionCentaurOrUnicorn = userInput.nextLine();
                if (userSelectionCentaurOrUnicorn.trim().equals("1")){
                     mythicalCreatureShelter.addNewCentaur();
                } else if (userSelectionCentaurOrUnicorn.trim().equals("2")){
                    mythicalCreatureShelter.addNewUnicorn();
                } else { throw new IllegalArgumentException("You must choose 1 or 2");
                }
            } else if (userSelection.trim().equalsIgnoreCase("I")) {
                userPet.walkPet();
                System.out.println("Message from "+ userPet.getName()+": I enjoyed our walk!");

            } else if (userSelection.trim().equalsIgnoreCase("J")) {
                 userPet.petCare();
                System.out.println("Thanks so much for taking great care of me!");
            }else if (userSelection.trim().equalsIgnoreCase("K")) {
                mythicalCreatureShelter.walkAllUnicorns();
                System.out.println("Thanks so much for taking great care of me!");
            }

            else
            {
                System.out.println("Your selection must be 1-8 or A-J.");
                System.out.println(proceedMessage);
                userSelection = userInput.nextLine();
            }

            System.out.println(instructions);
            System.out.println(proceedMessage);
            userSelection = userInput.nextLine();
        }
        {
            System.out.println("Sorry, the game has ended and unfortunately " + userPet.getName() + " is no longer with us.");
        }
    }
}





