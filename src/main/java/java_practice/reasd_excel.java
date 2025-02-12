package java_practice;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class reasd_excel {

public static void main(String[] args) throws IOException {
		
		String Filelocation = "./Test/Login_AIM.xlsx";
		XSSFWorkbook wb = new XSSFWorkbook(Filelocation);
		
		XSSFSheet sheet = wb.getSheetAt(0);
		for (int i = 1; i <=4; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < 2; j++) {
				XSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				System.out.println(value); 
				System.out.println("hi");
			} 
		}
	}
}
