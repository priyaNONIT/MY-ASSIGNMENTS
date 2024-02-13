package week6.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SchoolReadExcel {
	public static String[][] readExcel(String excelFileName) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook("./data/"+excelFileName+".xlsx");
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rowNum = sheet.getLastRowNum();
		System.out.println("Total Rows:"+rowNum);
		int cellNum = sheet.getRow(0).getLastCellNum();
		System.out.println("Total Column:"+cellNum);
		String[][] data=new String[rowNum][cellNum];
		for (int i = 1; i <=rowNum; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < cellNum; j++) {
				String stringCellValue = row.getCell(j).getStringCellValue();
				data[i-1][j]=stringCellValue;
				//System.out.println(stringCellValue);
				
			}
			workbook.close();
			
			
			
		}
		return data;
		}

	

	

	
	
}