//package generic;
//
//import java.net.MalformedURLException;
//import java.util.Collections;
//import java.util.concurrent.CompletableFuture;
//import java.util.concurrent.ExecutionException;
//
//import com.microsoft.aad.msal4j.ClientCredentialFactory;
//import com.microsoft.aad.msal4j.ClientCredentialParameters;
//import com.microsoft.aad.msal4j.ConfidentialClientApplication;
//import com.microsoft.aad.msal4j.IAuthenticationResult;
//import com.microsoft.aad.msal4j.IConfidentialClientApplication;
//
//public class OAuthEmailUtility {
//	
//	
//	
//	 private static final String CLIENT_ID = "8ff5cbf7-52bf-4c7e-96fe-6e6725bd0a11";
//	 		
//	 private static final String TENANT_ID = "deaf5f18-3a52-4151-bff5-ed8bd300f4bb";
//	 private static final String CLIENT_SECRET = "yl~8Q~kDTPRiMI4FxepJL2wumHhSnmtU1mnVmasp";
//	 private static final String SCOPE = "https://outlook.office365.com/.default";  // Change to appropriate scope
//
////public static String getAccessToken() throws MalformedURLException {
//	
//	    
//	    
////    IConfidentialClientApplication app = ConfidentialClientApplication
////            .builder(CLIENT_ID, ClientCredentialFactory.createFromSecret(CLIENT_SECRET))
////            .authority("https://login.microsoftonline.com/" + TENANT_ID)
////            .build();
////
////    ClientCredentialParameters clientCredentialParam = ClientCredentialParameters
////            .builder(Collections.singleton(SCOPE))
////            .build();
////
////    CompletableFuture<IAuthenticationResult> future = app.acquireToken(clientCredentialParam);
////    IAuthenticationResult result = null;
////    try {
////        result = future.get();
////    } catch (InterruptedException | ExecutionException e) {
////        e.printStackTrace();
////    }
////
////    return result != null ? result.accessToken() : null;
////}
//	
//	 public static String getAccessToken() throws MalformedURLException {
//	        // Create the ConfidentialClientApplication
//	        IConfidentialClientApplication app = ConfidentialClientApplication
//	                .builder(CLIENT_ID, ClientCredentialFactory.createFromSecret(CLIENT_SECRET))
//	                .authority("https://login.microsoftonline.com/" + TENANT_ID)
//	                .build();
//
//	        // Build the client credential parameters with the required scope
//	        ClientCredentialParameters clientCredentialParam = ClientCredentialParameters
//	                .builder(Collections.singleton(SCOPE))
//	                .build();
//
//	        // Acquire the access token
//	        CompletableFuture<IAuthenticationResult> future = app.acquireToken(clientCredentialParam);
//	        IAuthenticationResult result = null;
//	        try {
//	            result = future.get();
//	        } catch (InterruptedException | ExecutionException e) {
//	            e.printStackTrace(); // Consider logging the error for better tracking
//	        }
//
//	        // Return the access token if present
//	        return result != null ? result.accessToken() : null;
//	    }
//
//
//
//
//}