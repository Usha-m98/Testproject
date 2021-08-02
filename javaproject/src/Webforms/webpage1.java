package Webforms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webpage1
{
	static String calendarpicker="//img[@title='Select date']" ;
	static String date="//a[normalize-space()='3']";
	
   public static void main(String[] args) throws InterruptedException
   {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://swqe.test.subway.com/en-us/contactus/guestcare");
	d.manage().window().maximize();
	d.findElement(By.xpath("//input[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_btnRestaurantExperience']")).sendKeys(Keys.ENTER);
    d.findElement(By.xpath("//input[@id='txtFirstName']")).sendKeys("usha");
    d.findElement(By.xpath("//input[@id='txtLastName']")).sendKeys("test1");
    d.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("test@u.com");
    d.findElement(By.xpath("//input[@id='txtConfirmEmail']")).sendKeys("test@u.com");
    d.findElement(By.xpath("//input[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_txtPhoneNumber']")).sendKeys("1234567890");
    d.findElement(By.xpath("//select[@id='ddlState']")).sendKeys("Guam");
    d.findElement(By.xpath("//input[@id='storeNumber']")).sendKeys("30303");
    d.findElement(By.xpath("//input[@id='satelliteNumber']")).sendKeys("0");
    
   
    Thread.sleep(1000);
	 d.findElement(By.xpath(calendarpicker)).sendKeys(Keys.ENTER);
	  d.findElement(By.xpath(date)).sendKeys(Keys.ENTER);
    d.findElement(By.xpath("//select[@id='ddlVisitTimeHr']")).sendKeys("6");
    d.findElement(By.xpath("//select[@id='ddlVisitTimeMin']")).sendKeys("15");
    d.findElement(By.xpath("//select[@id='ddlVisit_ampm']")).sendKeys("PM");
    d.findElement(By.xpath("//input[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_txtTransactionId']")).sendKeys("!@#^#^$&%^*^&(&(#%@%@%");
    d.findElement(By.xpath("//textarea[@id='cs_comments']")).sendKeys("testing purpose");
    d.findElement(By.xpath("//a[normalize-space()='Submit']")).sendKeys(Keys.ENTER);
   }
   
}
