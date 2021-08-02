package automat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class GenericMethods 
{
	WebDriver d;
	
	@BeforeTest
	public void openppln()
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		d=new ChromeDriver();
		d.manage().window().maximize();
		//d.get("https://swqe.test.subway.com/en-us/contactus/guestcare");
		}
		
		@AfterTest
		public void closeappln()
		{
			System.out.println("Tested successfully");
		}
	}

