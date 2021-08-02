package javaproject;




import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class screenshot {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://demo.guru99.com/v4/");
		TakesScreenshot ts= (TakesScreenshot)d;
		  File src = ts.getScreenshotAs(OutputType.FILE);
		  //File dst = new File("./Screenshots/guru.png");
		  //Files.copyFile(src,dst);
		 // FileHandler.copy(src, dst);
		  FileHandler.copy(src, new File("./Screenshots/guru1.png"));
		  System.out.println("screenshot taken");
		  d.quit();
	}

	

}
