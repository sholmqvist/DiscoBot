import discord4j.core.DiscordClientBuilder;
import discord4j.core.GatewayDiscordClient;
import java.io.IOException;


public class Bot {

    public static void main(String[] args) throws IOException {

        ConfigHandler config = new ConfigHandler();
        String token = config.getTokenFromConfig();

        GatewayDiscordClient client = DiscordClientBuilder.create(token)
                .build()
                .login()
                .block();
        client.onDisconnect().block();
    }
}
