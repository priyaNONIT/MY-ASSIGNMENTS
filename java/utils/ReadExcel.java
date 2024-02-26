package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readExcel(String excelFileName) throws IOException {
	XSSFWorkbook xssfWorkbook = new XSSFWorkbook("./data/"+excelFileName+".xlsx");
    XSSFSheet sheet=xssfWorkbook.getSheetAt(0);
    int rowcount=sheet.getLastRowNum();
    System.out.println("no of rows:"+rowcount);
    int columncount=sheet.getRow(0).getLastCellNum();
    System.out.println("no of column:"+columncount);
    String[][] input=new String[rowcount][columncount];
    for (int i = 1; i <=rowcount; i++) {
    	XSSFRow row = sheet.getRow(i);
    	for (int j = 0; j <columncount; j++) {
    		String stringCellValue = row.getCell(j).getStringCellValue();
    		input[i-1][j]=stringCellValue;
			
		}
    	xssfWorkbook.close();
    	
    	
	
    }	// TODO Auto-generated method stub
	return input;
	
    }
	

	

}
