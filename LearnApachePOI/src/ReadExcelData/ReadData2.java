package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//Specify the excel data location by File class
		File src=new File("G:\\TOOLS\\ExcelData\\TestData.xlsx");
       
		FileInputStream fis=new FileInputStream(src);
		
		//open workbook of test data
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		//From which sheet you want to pick the data
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		int rowcount=sheet1.getLastRowNum();
		
		System.out.println("Number of rows are "+rowcount);
		
		for(int i = 0;i<rowcount;i++)
		{
			String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
			
			//System.out.println("Test Data from excel is "+data0);
			System.out.println("Test Data from row"+i+" is "+data0);
		}
		
		wb.close();
	}
	

}
