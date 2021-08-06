package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datadriven_excel {

	
	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		WebDriverManager.chromedriver().setup();
		FileInputStream fis=new FileInputStream("./Excel/Data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("data");
		
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(sh.getRow(1).getCell(0).getStringCellValue());
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(sh.getRow(1).getCell(1).getStringCellValue());
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
       System.out.println("login is sucessful");
        //Thread.sleep(1000);
        
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        //input[@id='btnAdd']
         driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
         driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(sh.getRow(6).getCell(2).getStringCellValue());
         driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys(sh.getRow(6).getCell(3).getStringCellValue());
         driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(sh.getRow(6).getCell(4).getStringCellValue());
        driver.findElement(By.xpath("//input[@id='chkLogin']")).click();
        //input[@id='user_name']
        driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys(sh.getRow(6).getCell(5).getStringCellValue());
        driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys(sh.getRow(6).getCell(6).getStringCellValue());
        driver.findElement(By.xpath("//input[@id='re_password']")).sendKeys(sh.getRow(6).getCell(7).getStringCellValue());
        //select[@id='status']
        
        Select drpStatus = new Select(driver.findElement(By.xpath("//select[@id='status']")));
        drpStatus.selectByVisibleText("Disabled");
         
        driver.findElement(By.xpath("//input[@id='btnSave']")).click();
        System.out.println("save is sucessful");
        
        Thread.sleep(2000);
    JavascriptExecutor jse=(JavascriptExecutor)driver;
     
        jse.executeScript("scrollBy(0,500)");	
        
         WebElement ele=driver.findElement(By.id("btnSave"));
            JavascriptExecutor jse1=(JavascriptExecutor)driver;
            jse1.executeScript("arguments[0].click()", ele);
        
            Thread.sleep(2000);
        //driver.findElement(By.linkText("Driver's License Number")).sendKeys("Altpd759922");
        driver.findElement(By.xpath("//input[@id='personal_txtLicenNo']")).sendKeys("Altpd759922");
        driver.findElement(By.xpath("//select[@id='personal_cmbMarital']")).sendKeys("Married");
                
        driver.quit();

	}

}
