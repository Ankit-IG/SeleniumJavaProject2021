package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//Specify the excel data location by File class
		File src=new File("G:\\TOOLS\\ExcelData\\TestData.xlsx");
       
		FileInputStream fis=new FileInputStream(src);
		
		//open workbook of test data
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		//From which sheet you want to pick the data
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		//Capture the data written in the row and cell by index
		String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println("Data from excel is "+data0);
		
        String data1=sheet1.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println("Data from excel is "+data1);
		
		wb.close();
	}
	

}
