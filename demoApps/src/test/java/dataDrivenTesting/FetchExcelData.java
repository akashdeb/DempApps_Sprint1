package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//Create an object of FIS and pass the file path in the const
		FileInputStream fis = new FileInputStream("C:\\Users\\User\\Desktop\\Scripts\\eclipse-workspace_Mar2024_430\\demoApps\\src\\test\\resources\\ExcelData3.xlsx");
		//Get the access of the workbook by calling the create() of Workbook Factory Class and pass the FIS ref
		Workbook workbook = WorkbookFactory.create(fis);
		//Get the access of the sheet by calling the getSheet() of Workbook Interface and pass the sheet name
		Sheet sheet = workbook.getSheet("Sheet1");
		//Get the access of the row by calling the getRow() of Sheet Interface and pass the row number
		Row row = sheet.getRow(1);
		//Get the access of the cell by calling the getCell() of Cell Interface and pass the cell number
		Cell cell = row.getCell(0);
		//Access the data depending on the data type
		String name = cell.getStringCellValue();
		
		System.out.println(name);
		
		long phone = (long)row.getCell(3).getNumericCellValue();
		
		System.out.println(phone);
		
		boolean zulusStatus = sheet.getRow(2).getCell(4).getBooleanCellValue();
		
		System.out.println(zulusStatus);
	}

} 
