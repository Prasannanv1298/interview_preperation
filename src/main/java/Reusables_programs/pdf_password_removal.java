package Reusables_programs;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;

public class pdf_password_removal {

	
	 public static void main(String[] args) {
	        String inputFile = "C:\\Users\\PRASANNAN\\Downloads\\XXXXXXXXXXXXXXX3642-01-04-2022to01-02-2025.pdf";  // Change to your file path
	        String outputFile = "C:\\Users\\PRASANNAN\\Downloads\\CI_Bank_Statements01-04-2022to01-02-2025.pdf";
	        String password = "";  // Enter the known password

	        try {
	            // Load the password-protected PDF
	            PDDocument document = PDDocument.load(new File(inputFile), password);

	            // Remove encryption
	            document.setAllSecurityToBeRemoved(true);

	            // Save the new PDF without a password
	            document.save(outputFile);
	            document.close();

	            System.out.println("Password removed successfully! Unlocked PDF saved at: " + outputFile);
	        } catch (IOException e) {
	            System.err.println("Error: " + e.getMessage());
	        }
	    }
}
