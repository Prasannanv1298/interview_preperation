package Reusables_programs;

import java.io.IOException;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class interview_email {
	
	
//	public static void main(String[] args) throws IOException {
//		
//		interview_email e = new interview_email();
//		
//
//		XSSFWorkbook book = new XSSFWorkbook("D:\\Automation_workspace\\GitDesktop\\interview_preperation\\src\\main\\resources\\emails.xlsx");
//		XSSFSheet sheet = book.getSheet("Sheet1");
//		
//		for(int i =1; i<=1;i++) {
//			XSSFRow  row = sheet.getRow(i);
//		XSSFCell cell=	row.getCell(0);
//		String val=	cell.getStringCellValue();
//			System.out.println(val);
//			e.sendEmail(val);
//		}
//	}

	
	
		  public static void main(String[] args) {
		        // Sender's Gmail credentials
		        final String senderEmail = "prasannanv.qa@gmail.com";  // Replace with your email
		        final String senderPassword = "Comp1234%";  // Use an App Password

		        // Receiver Email
		        String recipientEmail = "prasannanv1212@gmail.com"; // Replace with recipient email

		        // SMTP Server Properties
		        Properties properties = new Properties();
		        properties.put("mail.smtp.host", "smtp.gmail.com");
		        properties.put("mail.smtp.port", "587");
		        properties.put("mail.smtp.auth", "true");
		        properties.put("mail.smtp.starttls.enable", "true");

		        // Authenticate using the sender's credentials
		        Session session = Session.getInstance(properties, new Authenticator() {
		            protected PasswordAuthentication getPasswordAuthentication() {
		                return new PasswordAuthentication(senderEmail, senderPassword);
		            }
		        });

		        try {
		            // Create a new Email Message
		            Message message = new MimeMessage(session);
		            message.setFrom(new InternetAddress(senderEmail));
		            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
		            message.setSubject("Test Email from Java");
		            message.setText("Hello,\n\nThis is a test email sent using JavaMail API!");

		            // Send Email
		            Transport.send(message);
		            System.out.println("Email Sent Successfully!");
		            
		        } catch (MessagingException e) {
		            e.printStackTrace();
		        }
		    }
	
	
	  // Send email method
    public void sendEmail(String to) throws IOException {
    	
    }
}
