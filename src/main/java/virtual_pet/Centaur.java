package virtual_pet;


public abstract class Centaur extends MythicalCreatures {
    private String hoofShape;

    public Centaur(String name, String superPower, int age, int restLevel, int boredomLevel, int hungerLevel,
                   int thirstLevel, String hoofShape) {
        super(name, superPower, age, restLevel, boredomLevel, hungerLevel, thirstLevel);
        this.hoofShape = hoofShape;
    }

    public void walkPet() {
    }

    @Override
    public String greeting() {
        return "Congratulations! " + name + " is your virtual centaur. " + name + " is  " + age + " years old, and has the \n super power of " + superPower + ", and a hoof shaped like " +
        hoofShape + ".";

    }

    public void asciiPet(){
        System.out.println( "       __\n" +
                "               / _\\ #\n" +
                "               \\c /  #\n" +
                "               / \\___ #\n" +
                "               \\`----`#==>  \n" +
                "               |  \\  #\n" +
                "    ,%.-\"\"\"---'`--'\\#_\n" +
                "   %%/             |__`\\\n" +
                "  .%'\\     |   \\   /  //\n" +
                "  ,%' >   .'----\\ |  [/\n" +
                "     < <<`       ||\n" +
                "      `\\\\\\       ||\n" +
                "        )\\\\      )\\" );
    }
}