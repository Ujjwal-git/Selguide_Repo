package utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

import org.testng.IExecutionListener;

import generic.EmailUtility;





public class ExecutionListener implements IExecutionListener{
	
EmailUtility eu;

	@Override
	public void onExecutionStart() {
		System.out.println("TestNG is starting the execution.");
	}

	@Override
	public void onExecutionFinish() {
		try {
			Thread.sleep(10000);

		
		
		System.out.println("TestNG Execution finished. Sending email...");
		System.out.println("TestNG has finished execution.");
		// Your code to send the emailable report after it's generated
		String subject = "Test Failed: ";
		String body = "The Selenium test case has failed. Test name: " + "<br><br>Please find the attached report.";

		// Construct the path to the emailable report
		String projectDir = System.getProperty("user.dir");
		String emailableReportPath = projectDir + "\\test-output\\emailable-report.html";

		
		String allureReportPath = projectDir + "\\allure-report\\index.html";
		// Send the email with the failure details and attachment
		//EmailUtility.sendEmail(subject, body, emailableReportPath, allureReportPath);
		   //generateAllureReport();
		   
		   
			Thread.sleep(5000);
		 
		 EmailUtility.sendEmail(subject, body, emailableReportPath,allureReportPath);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	  public static void generateAllureReport() {
		  
//      String resultsPath = "C:\\Users\\nainc\\eclipse-workspace\\selguide";
//	  String reportPath = "C:\\Users\\nainc\\eclipse-workspace\\selguide\\allure-report";
//	  String allurePath = "C:\\Users\\nainc\\eclipse-workspace\\selguide\\.allure\\allure-2.20.1\\bin\\allure.bat";

	
	          // Define the paths
	          String allureResultsDir = "C:\\Users\\nainc\\eclipse-workspace\\selguide"; // Directory where Allure results are stored
	          String allureReportDir = "C:\\Users\\nainc\\eclipse-workspace\\selguide\\allure-report"; // Output directory for the Allure report

	          // Generate Allure report using command line
	          generateAllureReport(allureResultsDir, allureReportDir);

	        }

	  public static void generateAllureReport(String resultsDir, String reportDir) {
		  String projectDir = System.getProperty("user.dir"); // Gets the current project directory
	        
	        // Define the paths for allure-results and allure-report using the project directory
	        String allureResultsPath = projectDir + "/allure-results";  // Path to JSON files
	        String allureReportPath = projectDir + "/allure-report";   // Path where you want to generate the report

	        // Generate Allure Report using Allure CLI
	        try {
	            ProcessBuilder processBuilder = new ProcessBuilder(
	                    "allure", "generate", allureResultsPath, "--clean", "-o", allureReportPath);
	            processBuilder.inheritIO(); // Allows console output to be displayed
	            Process process = processBuilder.start();
	            process.waitFor();

	            System.out.println("Allure report generated successfully at: " + allureReportPath);
	            System.out.println("You can manually open the report by navigating to the directory and opening 'index.html' in a browser.");

	        } catch (Exception e) {
	            e.printStackTrace();
	        }  }
	  
	  
}

	 



