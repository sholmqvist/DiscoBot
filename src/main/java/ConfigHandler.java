import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigHandler {


        String token = "";
        InputStream inputStream;
        public String getTokenFromConfig() throws IOException {
            try {
                Properties config = new Properties();
                String configFileName = "config.properties";

                inputStream = getClass().getClassLoader().getResourceAsStream(configFileName);

                if(inputStream != null) {
                    config.load(inputStream);
                } else {
                    throw new FileNotFoundException("Property file '" + configFileName +"' not found in the classpath");
                }

                token = config.getProperty("token");


            }catch (Exception e) {
                System.out.println("Exception: " + e);
            } finally {
                inputStream.close();
            }

            return token;

    }



}
