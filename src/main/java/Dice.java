public class Dice {

    private static String commandName = "roll";
    private static String commandMessage;

    public static String getName(){
        return commandName;
    }

    public static int roll(){

        int result = (int)(Math.random()*6) + 1;
        return result;
    }

    public static String diceRollEvent(){

        commandMessage = "The result of your roll was: " + roll();

        return commandMessage;
    }



}
