package datadriven;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;

//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelfile 
{
public static void main(String[] args) throws Exception
{
	FileInputStream fis=new FileInputStream("./Excel/Data.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet("Sheet1");
	String r = sh.getRow(1).getCell(1).toString();
	//Cell c = r.getCell(1);
	//String v = c.toString();
	System.out.println(r);
}




}
