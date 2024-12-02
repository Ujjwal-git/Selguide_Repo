//package generic;
//
//import java.util.Properties;
//
//public class EmailUtility1 {
//	public static void sendEmail(String subject, String body) {
//        try {
//            String accessToken = OAuthHelper.getAccessToken();
//
//            Properties props = new Properties();
//            props.put("mail.smtp.auth", "true");
//            props.put("mail.smtp.starttls.enable", "true");
//            props.put("mail.smtp.host", "smtp.office365.com");
//            props.put("mail.smtp.port", "587");
//            
//            Authenticator auth = new Authenticator() {
//                @Override
//                protected PasswordAuthentication getPasswordAuthentication() {
//                    return new PasswordAuthentication("<your-email>", accessToken);
//                }
//            };
//
//            Session session = Session.getInstance(props, auth);
//            
//            MimeMessage message = new MimeMessage(session);
//            message.setFrom(new InternetAddress("<your-email>"));
//            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("<recipient-email>"));
//            message.setSubject(subject);
//            message.setText(body);
//            message.setSentDate(new Date());
//
//            Transport.send(message);
//            
//            System.out.println("Email sent successfully!");
//
//        } catch (MessagingException e) {
//            e.printStackTrace();
//        }
//    }
//
//}
