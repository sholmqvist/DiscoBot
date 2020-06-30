import org.json.JSONObject;


public class TokenHandler {
    static String tokenJson = "token.json";
    public static String getToken() {
        JSONObject json = new JSONObject();
        String token = json.getString("token");
        System.out.println(token);

        return token;
    }

}
