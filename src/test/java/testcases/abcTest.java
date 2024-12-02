package testcases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import generic.EmailUtility;
public class abcTest {

	
	@Test
	public void testSample()
	{
		WebDriver driver=new ChromeDriver();
		System.out.println("Simple ");
		driver.get("https://www.saucedemo.com/");
        String expectedTitle = "Example Domain";

        // Assert the title
        Assert.assertEquals(driver.getTitle(), expectedTitle, "Title validation failed!");
	}
	 @AfterMethod
	    public void afterMethod(ITestResult result) {
		 String projectDir = System.getProperty("user.dir");
			String emailableReportPath = projectDir + "\\test-output\\emailable-report.html";
			String allureResultsDir = "C:\\Users\\nainc\\eclipse-workspace\\selguide"; // Directory where Allure results are stored
	          String allureReportDir = "C:\\Users\\nainc\\eclipse-workspace\\selguide\\allure-report\\index.html"; // Output directory for the Allure report

	 
	        // Check if the test failed
	        if (result.getStatus() == ITestResult.FAILURE) {
	            System.out.println("Test failed. Sending an email...");
	            String subject = "Test Failed: " + result.getName();
	            String body = "The test '" + result.getName() + "' has failed.\n\n" +
	                          "Error: " + result.getThrowable();

	            EmailUtility.sendEmail(subject, body, allureReportDir, emailableReportPath);
	        }
	 }
	
}
