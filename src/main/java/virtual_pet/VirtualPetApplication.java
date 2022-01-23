package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {

        VirtualPet ozymandias = new VirtualPet("Ozymandias", "invisibility", 12, 5, 5, 5, 5);
        VirtualPet ravery = new VirtualPet("ravery", "  speaking to every living thing", 200, 5, 5, 5, 5);
        VirtualPet maisley = new VirtualPet("maisley", " living underwater", 8, 5, 5, 5, 5);
        VirtualPet juniper = new VirtualPet("juniper", "making her 3D printed things come to life", 37, 5, 5, 5, 5);
        VirtualPet codycode = new VirtualPet("codycode", " building software on the spot", 99, 5, 5, 5, 5);
        VirtualPet atlas = new VirtualPet("atlas", "being able to go around the world in 10 seconds or less", 53, 5, 5, 5, 5);
        VirtualPet pauletta = new VirtualPet("pauletta", "being able to solve any math problem instantly", 32, 5, 5, 5, 5);
        VirtualPet shardude = new VirtualPet("shardude", "being able to play any musical instrument in the world", 94, 5, 5, 5, 5);

        System.out.println("Welcome to Virtual Pet land! To get started, please type the number that represents your favorite" +
                "color. \n 1- red \n 2- orange \n 3- blue \n 4- green \n 5- purple \n 6-black \n 7- pink \n 8- My favorite color is not listed.");

        Scanner userInput = new Scanner(System.in);

        String userFavColor = userInput.nextLine();

        String greeting;
        VirtualPet userPet;
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

        String instructions = "Press the corresponding key to perform these actions with your pet: \n1- Get status of " +
                "your pet \n2- Feed  \n3- Give water \n4- Give rest \n5- Play with your pet";

        System.out.println(instructions);

        String proceedMessage = "How would you like to proceed?";
        System.out.println(proceedMessage);

        String userSelection = userInput.nextLine();


        while (userPet.getrestLevel() > 15 || userPet.getBoredomLevel() > 15 || userPet.getThirstLevel() > -5 &&
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
            } else {
                System.out.println("Your selection must be 1-8.");
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





