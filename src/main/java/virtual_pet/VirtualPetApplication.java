package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {

    VirtualPetShelter mythicalCreatureShelter = new VirtualPetShelter();

        //Because I made the Unicorn class abstract, I now need to define whether the new instances that I make are
        //robotic or organic. So instead of just making a new Unicorn, I specify which one it is
        OrganicUnicorn ozymandias = new OrganicUnicorn("Ozymandias", "invisibility", 12, 5, 5, 5, 5, "spiral");
        OrganicUnicorn ravery = new OrganicUnicorn("Ravery", "  speaking to every living thing", 200, 5, 5, 5, 5, "tongue");
        OrganicUnicorn maisley = new OrganicUnicorn("Maisley", " living underwater", 8, 5, 5, 5, 5, "fish");
        OrganicUnicorn juniper = new OrganicUnicorn("Juniper", "making her 3D printed things come to life", 37, 5, 5, 5, 5, "tv");
        RoboticUnicorn codycode = new RoboticUnicorn("Codycode", " building software on the spot", 99, 5, 5, 5, 5, "laptop");
        RoboticUnicorn atlas = new RoboticUnicorn("Atlas", "being able to go around the world in 10 seconds or less", 53, 5, 5, 5, 5, "globe");
        RoboticUnicorn pauletta = new RoboticUnicorn("Pauletta", "being able to solve any math problem instantly", 32, 5, 5, 5, 5, "calculator");
        RoboticUnicorn shardude = new RoboticUnicorn("Shardude", "being able to play any musical instrument in the world", 94, 5, 5, 5, 5, "guitar");
        mythicalCreatureShelter.addUnicorn(ozymandias);
        mythicalCreatureShelter.addUnicorn(ravery);
        mythicalCreatureShelter.addUnicorn(maisley);
        mythicalCreatureShelter.addUnicorn(juniper);
        mythicalCreatureShelter.addUnicorn(codycode);
        mythicalCreatureShelter.addUnicorn(atlas);
        mythicalCreatureShelter.addUnicorn(pauletta);
        mythicalCreatureShelter.addUnicorn(shardude);



        System.out.println("Welcome to Virtual Pet land! To get started, please type the number that represents your favorite" +
                "color. \n 1- red \n 2- orange \n 3- blue \n 4- green \n 5- purple \n 6-black \n 7- pink \n 8- My favorite color is not listed.");

        Scanner userInput = new Scanner(System.in);

        String userFavColor = userInput.nextLine();

        String greeting;
        Unicorn userPet;
        switch (userFavColor.toLowerCase()) {
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

            default:
                greeting = shardude.greeting();
                userPet = shardude;
                break;

        }

        System.out.println(userPet.greeting());

        String asciiUnicorn = "                   ,%%%,\n" +
                "                 ,%%%` %==--\n" +
                "                ,%%`( '|\n" +
                "               ,%%@ /\\_/\n" +
                "     ,%.-\"\"\"--%%% \"@@__\n" +
                "    %%/             |__`\\\n" +
                "   .%'\\     |   \\   /  //\n" +
                "   ,%' >   .'----\\ |  [/\n" +
                "      < <<`       ||\n" +
                "       `\\\\\\       ||\n" +
                "         )\\\\      )\\\n" +
                " ^^^jgs^^\"\"\"^^^^^^\"\"^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n";
        System.out.println(asciiUnicorn);

        String instructions = "\nPress the corresponding key to perform these actions with your pet: \n1- Get status of " +
                "your pet \n2- Feed  \n3- Give water \n4- Give rest \n5- Play with your pet \n \nOR, would you like to hang" +
                "out with ALL of the creatures in the shelter?\n \nIf so, see the selections below: " +
                "\n\nA- Get status (of ALL pets) \nB- Feed (ALL pets)  \nC- Give water (to ALL pets) \nD- Give rest (to ALL pets)" +
                " \nE- Play (with ALL pets) \n\n OR see the following: \nF- See which pets are currently in the shelter" +
                "\nG-Adopt a pet \nH- Add a pet  ";

        System.out.println(instructions);

        String proceedMessage = "How would you like to proceed?";
        System.out.println(proceedMessage);

        String userSelection = userInput.nextLine();


        while (userPet.getRestLevel() > 15 || userPet.getBoredomLevel() > 15 || userPet.getThirstLevel() > -5 &&
                userPet.getThirstLevel() < 10 || userPet.getHungerLevel() > -5 && userPet.getHungerLevel() < 10) {

            if (userSelection.contains("1")) {
                System.out.println(userPet.statusMessage());

            } else if (userSelection.contains("2")) {
                userPet.tickMethod();
                userPet.feedPetMethod();
                System.out.println("That was a great meal, yum");

            } else if (userSelection.contains("3")) {
                userPet.tickMethod();
                userPet.waterPetMethod();
                System.out.println("That water was so refreshing! Thanks!");
            } else if (userSelection.contains("4")) {
                userPet.tickMethod();
                userPet.playMethod();
                System.out.println("Aww man, do I have to take a nap?...I guess it's for the best");
            } else if (userSelection.contains("5")) {
                userPet.tickMethod();
                userPet.playMethod();
                System.out.println("That was so much fun! I love to play.");
            } else if (userSelection.equalsIgnoreCase(  "A")){
                 mythicalCreatureShelter.showAllStatus();
            }else if (userSelection.equalsIgnoreCase("B")) {
                mythicalCreatureShelter.feedAll();
                System.out.println("\n \nThanks for giving us all something to eat! We can't wait until the next meal!\n \n");
            }else if (userSelection.equalsIgnoreCase("C")) {
                mythicalCreatureShelter.waterAll();
                System.out.println("\n \nThanks for giving us all something to drink!\n \n");
            }else if (userSelection.equalsIgnoreCase("D")) {
                mythicalCreatureShelter.giveRestToAll();
                System.out.println("\n \nNaptime for us :( \n \n");
            }else if (userSelection.equalsIgnoreCase("E")) {
                mythicalCreatureShelter.playWithAll();
                System.out.println("\n \nWe had such a great time playing with all our friends \n \n");
                System.out.println("\n \nWe had fun flying with our friends! Thanks for taking us to play!\n \n");
            } else if (userSelection.equalsIgnoreCase("F")) {
                System.out.println("\n \nHere's who's left in the shelter at this time: \n");
                mythicalCreatureShelter.getallMythicalCreatures();
            }else if (userSelection.equalsIgnoreCase("G")) {
                mythicalCreatureShelter.adoptUnicorn();
                System.out.println();
            }else if (userSelection.equalsIgnoreCase("H")) {
                mythicalCreatureShelter.addNewUnicorn();

            }

            else {
                System.out.println("Your selection must be 1-8 or A-H.");
                System.out.println(proceedMessage);
                        userSelection = userInput.nextLine();
            }

            System.out.println(instructions);
            System.out.println(proceedMessage);
            userSelection = userInput.nextLine();
        } {
            System.out.println("Sorry, the game has ended and unfortunately " + userPet.getName() + " is no longer with us.");
        }
    }
}





