import java.util.HashMap;
import java.util.Map;

public class CommandHandler {

    private static final Map<String, Command> commands = new HashMap<>();


    static {
        commands.put("ping", event -> event.getMessage().getChannel()
                .flatMap(channel -> channel.createMessage("Pong!"))
                .then());

        commands.put("ding", event -> event.getMessage().getChannel()
                .flatMap(channel -> channel.createMessage("Dong!"))
                .then());

        commands.put(Dice.getName(), event -> event.getMessage().getChannel()
                .flatMap(channel -> channel.createMessage(Dice.diceRollEvent())
                .then()));
    }


    public static Map<String, Command> getCommands(){
        return commands;

    }
}
