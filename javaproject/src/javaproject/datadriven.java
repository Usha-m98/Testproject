package javaproject;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class datadriven {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream("./Exelsheet/studentrecords.xlsx");
		//Object a = WorkbookFactory.create(fis);
		 Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		String r = sh.getRow(2).getCell(0).toString();
		//Cell c = r.getCell(1);
		//String v = c.toString();
		System.out.println(r);
	}
	

}


