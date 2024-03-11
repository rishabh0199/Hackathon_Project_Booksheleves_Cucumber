package utilities;

/***************************************
 *                                     *
 * AUTHOR       : Rishabh              *
 * DATE CREATED : 19-FEB-2024          *
 * PROJECT      : DisplayBookshelves   *
 *                                     *
 ***************************************/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/***********************************************************************************
*                                                                                  *
* Class Name     : ExcelWrite                                                      * 
* Description    : To Write the output on the excel sheet.                         *
*                                                                                  *
************************************************************************************/
//concept of overloading
public class ExcelWrite {

	public static FileOutputStream fileOP;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet = null;
	public static XSSFCell cell = null;
	public static XSSFCell cell2 = null;
	public static XSSFRow row = null;
	public static String exFilePath1 = ".//excel//UrbanLadderData.xlsx";
	//public static String exFilePath2 = ".//excel//LivingList.xlsx";
	
	public static void setDataExcel(String[] bookShelves , String[] prices , int x) {

		workbook = new XSSFWorkbook();
		sheet = workbook.createSheet("Below_15000");

		for (int i = 1; i <= x; i++) {
			
			row = ExcelWrite.sheet.getRow(i);
			
			if (row == null)
				row = ExcelWrite.sheet.createRow(i);
		
			cell = row.getCell(0);
			
			if (cell == null)
				cell = row.createCell(0);
			
			cell.setCellValue(bookShelves[i-1]);
			
			cell2 = row.getCell(1);
			
			if (cell2 == null)
				cell2 = row.createCell(1);
			
			cell2.setCellValue(prices[i-1]);
			
		}
		
		try {

			fileOP = new FileOutputStream(new File(exFilePath1));
			workbook.write(fileOP);
			fileOP.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}

	}
	
	public static void setDataExcel(String[] items , int x) {
		
		//workbook = new XSSFWorkbook();
		sheet = workbook.createSheet("LivingList");

		for (int i = 1; i <= x; i++) {
			
			row = ExcelWrite.sheet.getRow(i);
			
			if (row == null)
				row = ExcelWrite.sheet.createRow(i);
		
			cell = row.getCell(0);
			
			if (cell == null)
				cell = row.createCell(0);
			
			cell.setCellValue(items[i-1]);
			
		}
		
		try {

			fileOP = new FileOutputStream(new File(exFilePath1));
			workbook.write(fileOP);
			fileOP.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}
		
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//for passing data using excel	
	
//	public String getCellData(String sheetName,int rownum,int colnum) throws IOException
//	{
//		FileInputStream fi;
//		String path="";
//		fi=new FileInputStream(path);
//		workbook=new XSSFWorkbook(fi);
//		sheet=workbook.getSheet(sheetName);
//		row=sheet.getRow(rownum);
//		cell=row.getCell(colnum);
//		
//		DataFormatter formatter = new DataFormatter();
//		String data;
//		try{
//		data = formatter.formatCellValue(cell); //Returns the formatted value of a cell as a String regardless of the cell type.
//		}
//		catch(Exception e)
//		{
//			data="";
//		}
//		workbook.close();
//		fi.close();
//		return data;
//	}
	
}
