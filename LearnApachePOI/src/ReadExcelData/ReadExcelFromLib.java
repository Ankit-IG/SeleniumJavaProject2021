package ReadExcelData;

import Library.ExcelDataConfig;

public class ReadExcelFromLib {

	public static void main(String[] args) {
		
		ExcelDataConfig excel=new ExcelDataConfig("G:\\TOOLS\\ExcelData\\TestData.xlsx");
		
		System.out.println(excel.getData(1, 0, 1));
	}

}
