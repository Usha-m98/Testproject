package datadriven;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class screenshot {

	public static void main(String[] args) 
	{
		
		try {
		
		WebDriverManager.chromedriver().setup();
		  WebDriver d = new ChromeDriver();	
		  
		  d.get("https://swqe.test.subway.com/en-us/contactus/guestcare");
		 Screenshot scrnshot = new AShot().takeScreenshot(d);
		 FileHandler.copy(scrnshot, new File("./Screenshots/gurupp.png"));
		 //d.close();
		 d.quit();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		  
	}
	
}
