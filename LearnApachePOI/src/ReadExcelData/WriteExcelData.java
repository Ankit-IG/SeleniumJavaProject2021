package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//Specify the excel data location by File class
		File src=new File("G:\\TOOLS\\ExcelData\\TestData.xlsx");
       
		FileInputStream fis=new FileInputStream(src);
		
		//open workbook of test data
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		//From which sheet you want to pick the data
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		sheet1.getRow(0).createCell(2).setCellValue("Pass");

		sheet1.getRow(1).createCell(2).setCellValue("Fail");
		
		FileOutputStream fout= new FileOutputStream(src);
		
		wb.write(fout);
		
		wb.close();
	}
	

}
