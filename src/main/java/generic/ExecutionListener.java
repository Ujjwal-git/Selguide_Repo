//package generic;
//import org.testng.IExecutionListener;
//import generic.EmailUtility;
//
//public class ExecutionListener implements IExecutionListener {
//
//	@Override
//	public void onExecutionStart() {
//		System.out.println("TestNG is starting the execution.");
//	}
//
//	@Override
//	public void onExecutionFinish() {
//		try {
//			Thread.sleep(10000);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("TestNG Execution finished. Sending email...");
//		System.out.println("TestNG has finished execution.");
//		// Your code to send the emailable report after it's generated
//		String subject = "Test Failed: ";
//		String body = "The Selenium test case has failed. Test name: " + "<br><br>Please find the attached report.";
//
//		// Construct the path to the emailable report
//		String projectDir = System.getProperty("user.dir");
//		String emailableReportPath = projectDir + "\\test-output\\emailable-report.html";
//
//		
//		String allureReportPath = projectDir + "\\allure-report\\index.html";
//		// Send the email with the failure details and attachment
//		//EmailUtility.sendEmail(subject, body, emailableReportPath, allureReportPath);
//		 EmailUtility.sendEmail(subject, body, emailableReportPath,allureReportPath);
//
//	}
//
//}
