package testcases;
import java.util.prefs.Preferences;
public class SecretKey {
	
	    public static void main(String[] args) {
	        Preferences prefs = Preferences.userNodeForPackage(SecretKey.class);

	        // Save the secret key
	        prefs.put("SECRET_KEY", "your-secret-value");

	        // Retrieve the secret key
	        String secret = prefs.get("SECRET_KEY", null);
	        System.out.println("The secret key is: " + secret);
	    }
	}


