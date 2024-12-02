package generic;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;

import java.io.File;
import java.util.Properties;

public class EmailUtility {

	public static void sendEmail(String subject, String body,String filePath1,String filePath2) {
		// Outlook SMTP server configuration
		String host = "smtp.gmail.com";
		String port = "587";
		String username = "rajatverma15890@gmail.com";
		String password = "fhzg ihzj movp vxbe";

		Properties properties = new Properties();
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", port);
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");

		Session session = Session.getInstance(properties, new Authenticator() {
            @Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});
		session.setDebug(true);
		String projectDir = System.getProperty("user.dir");
        File testOutputDir = new File(projectDir, "test-output");

        // Find the emailable-report.html file
        File[] files = testOutputDir.listFiles((dir, name) -> name.startsWith("emailable-report") && name.endsWith(".html"));
        File emailableReportFile = files != null && files.length > 0 ? files[0] : null;
        
        
        File allureReportDir = new File(projectDir, "allure-report");
        File[] allureFiles = allureReportDir.listFiles((dir, name) ->name.startsWith("index") && name.endsWith(".html"));
        File allureReportFile = allureFiles != null && allureFiles.length > 0 ? allureFiles[0] : null;
        
        
        

        if (emailableReportFile == null) {
            System.out.println("Emailable report not found in directory.");
            return;
        }

		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("rajatverma7890@outlook.com"));
			//dhereakhilesh@gmail.com
			message.setSubject(subject);
			BodyPart messageBodyPart = new MimeBodyPart();
			  messageBodyPart.setContent(body, "text/html");
			//message.setText(body);
			Multipart multipart = new MimeMultipart();
			 multipart.addBodyPart(messageBodyPart);

	            // Part two is the attachment
			 if (emailableReportFile.exists()) {
	                messageBodyPart = new MimeBodyPart();
	                FileDataSource source = new FileDataSource(filePath1);
	                messageBodyPart.setDataHandler(new DataHandler(source));
	                messageBodyPart.setFileName(new File(filePath1).getName());
	                multipart.addBodyPart(messageBodyPart);
	            } else {
	                System.out.println("Attachment file not found at: " + filePath1);
	            }
			 
			 
			
	                messageBodyPart = new MimeBodyPart();
	                FileDataSource source = new FileDataSource(filePath2);
	                messageBodyPart.setDataHandler(new DataHandler(source));
	                messageBodyPart.setFileName(new File(filePath2).getName());
	                multipart.addBodyPart(messageBodyPart);
	            
//	                System.out.println("Attachment file not found at: " + filePath2);
//	            }

			 message.setContent(multipart);
			Transport.send(message);
			System.out.println("Email sent successfully!");

		} catch (MessagingException e) {
			e.printStackTrace();  
		}
		
	}
}
