package virtual_pet ;

public abstract class Unicorn extends MythicalCreatures {


    private String hornShape;

    public Unicorn(String name, String superPower, int age, int restLevel, int boredomLevel,
                   int hungerLevel, int thirstLevel, String hornShape) {
         super(name, superPower, age, restLevel, boredomLevel, hungerLevel, thirstLevel);
        this.hornShape = hornShape;
    }
    public void walkPet() {
    }

    @Override
    public String greeting() {
        return "Congratulations! " + name + " is your virtual unicorn. " + name + " is  " + age + " years old, and she has the \n super power of " + superPower + "- and a " +
                hornShape + " shaped horn.";
    }

    public void asciiPet(){
        System.out.println( "                   ,%%%,\n" +
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
                " ^^^jgs^^\"\"\"^^^^^^\"\"^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n");
    }
}


























