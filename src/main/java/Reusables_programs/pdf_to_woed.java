package Reusables_programs;

import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.xwpf.usermodel.*;

import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;

public class pdf_to_woed {

	
	public static void main(String[] args) {
        String pdfFilePath = "C:\\Users\\PRASANNAN\\Downloads\\dd.pdf";  // Change this to your PDF path
        String wordFilePath = "C:\\Users\\PRASANNAN\\Downloads\\dd.docx";

        convertPDFToWord(pdfFilePath, wordFilePath);
    }

    public static void convertPDFToWord(String pdfPath, String wordPath) {
    	
    	  try (PDDocument document = PDDocument.load(new File(pdfPath));
    	             FileOutputStream fos = new FileOutputStream(wordPath);
    	             XWPFDocument wordDocument = new XWPFDocument()) {

    	            PDFTextStripper pdfStripper = new PDFTextStripper();
    	            pdfStripper.setSortByPosition(true);  // Preserve Tamil character order
    	            String text = pdfStripper.getText(document);

    	            // Add text to Word document (Tamil support)
    	            XWPFParagraph paragraph = wordDocument.createParagraph();
    	            XWPFRun run = paragraph.createRun();
    	            run.setFontFamily("Latha");  // Tamil font (Can change to Vijaya, Nirmala UI)
    	            run.setText(text);
    	            run.setFontSize(12);

    	            // Extract images and add to Word
    	            PDFRenderer pdfRenderer = new PDFRenderer(document);
    	            for (int i = 0; i < document.getNumberOfPages(); i++) {
    	                BufferedImage image = pdfRenderer.renderImage(i);

    	                File imageFile = new File("temp_image_" + i + ".png");
    	                ImageIO.write(image, "png", imageFile);

    	                // Add image to Word
    	                XWPFParagraph imgPara = wordDocument.createParagraph();
    	                XWPFRun imgRun = imgPara.createRun();
    	                try (FileInputStream fis = new FileInputStream(imageFile)) {
    	                    imgRun.addPicture(fis, XWPFDocument.PICTURE_TYPE_PNG, imageFile.getName(),
    	                            500, 400);  // Adjust image size as needed
    	                }
    	            }

    	            // Save the Word document
    	            wordDocument.write(fos);
    	            System.out.println("✅ Conversion completed: " + wordPath);
    	        } catch (Exception e) {
    	            e.printStackTrace();
    	        }
    }
}
