//package generic;
//
//import java.util.Collections;
//
//import com.azure.identity.ClientSecretCredential;
//import com.azure.identity.ClientSecretCredentialBuilder;
//import com.microsoft.graph.auth.authentication.BearerTokenAuthenticationProvider;
//import com.microsoft.graph.requests.GraphServiceClient;
//import okhttp3.Request;
//
//public class OAuthHelper {
//
//	  private static final String CLIENT_ID = "<your-client-id>";
//	    private static final String CLIENT_SECRET = "<your-client-secret>";
//	    private static final String TENANT_ID = "<your-tenant-id>";
//
//	    public static String getAccessToken() {
//	        ClientSecretCredential credential = new ClientSecretCredentialBuilder()
//	                .clientId(CLIENT_ID)
//	                .clientSecret(CLIENT_SECRET)
//	                .tenantId(TENANT_ID)
//	                .build();
////
////	        GraphServiceClient<Request> graphClient = 
////	            GraphServiceClient
////	                .builder()
////	                .authenticationProvider(credential)
////	                .buildClient();
////
////	        return graphClient
////	                .me()
////	                .sendEmail(Collections.singletonList("dummy"))
////	                .toString(); // Replace with your actual email sending logic
//	    }
//	
//}
