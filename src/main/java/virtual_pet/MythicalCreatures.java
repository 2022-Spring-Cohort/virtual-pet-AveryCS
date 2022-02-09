package virtual_pet;

import javax.swing.*;

public abstract class MythicalCreatures {

    protected String name;
    protected int hungerLevel;
    protected int thirstLevel;
    protected int boredomLevel;
    protected String color;
    protected String superPower;
    protected int age;
    protected int restLevel;



    public MythicalCreatures(String name, String superPower, int age, int restLevel, int boredomLevel,
                             int hungerLevel, int thirstLevel) {
        this.name = name;
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.boredomLevel = boredomLevel;
        this.color = color;
        this.superPower = superPower;
        this.age = age;
        this.restLevel = restLevel;



    }

    public String getName() {
        return name;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }

    public int getBoredomLevel() {
        return boredomLevel;
    }

    public String getColor() {
        return color;
    }

    public String getSuperPower() {
        return superPower;
    }

    public int getAge() {
        return age;
    }

    public int getRestLevel() {
        return restLevel;
    }

    public abstract void walkPet();
    public abstract int petCare();
    public boolean canKeepPlaying(){
         if(getRestLevel() > -5 && getRestLevel() < 15 || getBoredomLevel() < 15 && getBoredomLevel()>-5 || getThirstLevel() > -5 &&
                getThirstLevel() < 10 || getHungerLevel() > -5 && getHungerLevel() < 10)
         return true;
         else return false;
    }




    public abstract String greeting();
    public abstract void asciiPet();

    public String statusMessage(){
        return  "Here's what " + name+" has to say:\n" + hungerLevelMessage()+ "\n" + thirstLevelMessage()+"\n" + boredomLevelMessage()+ "\n" +restLevelMessage() +"\n \n";
    }


    String hungerLevelMessage() {
        String hungerLevelMessage;
        if (hungerLevel <= 4) {
            hungerLevelMessage = "I am not hungry.";
            return hungerLevelMessage;
        } else if (hungerLevel <= 7) {
            hungerLevelMessage =  "I could use a snack";
            return hungerLevelMessage;
        } else if (hungerLevel >= 8) {
            hungerLevelMessage = "I'm hungry and ready to eat";
            return hungerLevelMessage;
        } else return "";
    }

    public String thirstLevelMessage() {
        String thirstLevelMessage;
        if (thirstLevel <= 4) {
            thirstLevelMessage = "I am not thirsty";
        } else if (thirstLevel >= 5 && thirstLevel <= 7) {
            thirstLevelMessage =  "I could use a drink";
        } else if (thirstLevel >= 8) {
            thirstLevelMessage = "I need water asap!";
        } else {
            return "";
        }
        return thirstLevelMessage;
    }

    public String boredomLevelMessage(){
        String boredomLevelMessage;
        if(boredomLevel <= 5){
            boredomLevelMessage = "I'm bored";
        }
        else if(boredomLevel >= 6){
            boredomLevelMessage = "I'm not bored.";
        }
        else{
            return "";}
        return boredomLevelMessage;
        }

    String restLevelMessage() {
        String restLevelMessage;
        if (restLevel <= 4) {
            restLevelMessage =  "I am exhausted.";
            return restLevelMessage;
        } else if (restLevel <= 7) {
            restLevelMessage = "I could play or take a nap- Doesn't matter to me!";
            return restLevelMessage;
        } else if (restLevel >= 8) {
            restLevelMessage = "Please, let's go play on a cloud!";
            return restLevelMessage;
        } else return "";
    }

    public void tickMethod(){
         hungerLevel++;
         thirstLevel++;

    }

    public void feedPetMethod(){
        hungerLevel-=2;
    }
    public void waterPetMethod(){
        thirstLevel-=3;
    }
    public void giveRestMethod(){
        thirstLevel ++;
        hungerLevel ++;
        boredomLevel++;
    }
    public void playMethod(){
        thirstLevel += 2;
        hungerLevel ++;
        restLevel -= 2;
        boredomLevel -= 2;
    }


    }




