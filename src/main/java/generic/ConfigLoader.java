package generic;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigLoader {
	 public static void main(String[] args) {
	        Properties properties = new Properties();
	        try (FileInputStream fis = new FileInputStream("config.properties")) {
	            properties.load(fis);
	            String secret = properties.getProperty("SECRET_KEY");
	            System.out.println("The secret key is: " + secret);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

}
