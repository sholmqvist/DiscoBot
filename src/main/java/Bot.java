import discord4j.core.DiscordClientBuilder;
import discord4j.core.GatewayDiscordClient;


public class Bot {

    public static void main(String[] args) {

        String token = TokenHandler.getToken();

        GatewayDiscordClient client = DiscordClientBuilder.create(token)
                .build()
                .login()
                .block();
        client.onDisconnect().block();
    }
}
