package automat;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WebPages extends GenericMethods
{
	//static String calendarpicker="//img[@title='Select date']" ;
    //String date="//a[normalize-space()='3']";
	//static String iosversiontoggle="//label[@class='guestcare-switch checkboxPhoneOsVersion iosPhoneVersion']//span[@class='guestcare-slider round']";
	
	@Test
	public void restaurant() 
	{
		
		d.get("https://swqe.test.subway.com/en-us/contactus/guestcare");
	    d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		
	    d.findElement(By.xpath("//input[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_btnRestaurantExperience']")).sendKeys(Keys.ENTER);
	    d.findElement(By.xpath("//input[@id='txtFirstName']")).sendKeys("usha");
	    d.findElement(By.xpath("//input[@id='txtLastName']")).sendKeys("test1");
	    d.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("test@u.com");
	    d.findElement(By.xpath("//input[@id='txtConfirmEmail']")).sendKeys("test@u.com");
	    d.findElement(By.xpath("//input[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_txtPhoneNumber']")).sendKeys("1234567890");
	    d.findElement(By.xpath("//select[@id='ddlState']")).sendKeys("Guam");
	    d.findElement(By.xpath("//input[@id='storeNumber']")).sendKeys("30303");
	    d.findElement(By.xpath("//input[@id='satelliteNumber']")).sendKeys("0");
	   
	    //WebDriverWait wait=new WebDriverWait(d,20);
		 //WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@title='Select date']")));
		 //ele.click();
	    //d.findElement(By.xpath("//img[@title='Select date']")).sendKeys(Keys.ENTER);
		  //d.findElement(By.xpath("//a[normalize-space()='3']")).sendKeys(Keys.ENTER);
	    d.findElement(By.xpath("//select[@id='ddlVisitTimeHr']")).sendKeys("6");
	    d.findElement(By.xpath("//select[@id='ddlVisitTimeMin']")).sendKeys("15");
	    d.findElement(By.xpath("//select[@id='ddlVisit_ampm']")).sendKeys("PM");
	    d.findElement(By.xpath("//input[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_txtTransactionId']")).sendKeys("!@#^#^$&%^*^&(&(#%@%@%");
	    d.findElement(By.xpath("//textarea[@id='cs_comments']")).sendKeys("testing purpose");
	    d.findElement(By.xpath("//a[normalize-space()='Submit']")).sendKeys(Keys.ENTER);
	    }
   
	@Test(priority=1)
	public void mobileapple()  
	{
		
		d.get("https://swqe.test.subway.com/en-us/contactus/guestcare");
		
		WebElement ele = d.findElement(By.name("v2main_0$insetcontainer_6cfebaeb54424adc88c25050d0487f87_0$btnDigitalOrder"));
		ele.click();
		d.findElement(By.xpath("//input[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_btnYourDigitalOrder_MobileAppIOS']")).sendKeys(Keys.ENTER);
		d.findElement(By.xpath("//input[@id='txtFirstName']")).sendKeys("usha");
		d.findElement(By.xpath("//input[@id='txtLastName']")).sendKeys("test1");
	    d.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("test@u.com");
	    d.findElement(By.xpath("//input[@id='txtConfirmEmail']")).sendKeys("test@u.com");
	    d.findElement(By.xpath("//input[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_txtPhoneNumber']")).sendKeys("1234567890");
	    d.findElement(By.xpath("//select[@id='ddlState']")).sendKeys("Guam");
	    d.findElement(By.xpath("//input[@id='storeNumber']")).sendKeys("82589");
	    d.findElement(By.xpath("//input[@id='satelliteNumber']")).sendKeys("02");
	 
		  //d.findElement(By.xpath("//a[normalize-space()='3']")).sendKeys(Keys.ENTER);
	    d.findElement(By.xpath("//select[@id='ddlVisitTimeHr']")).sendKeys("6");
	    d.findElement(By.xpath("//select[@id='ddlVisitTimeMin']")).sendKeys("15");
	    d.findElement(By.xpath("//select[@id='ddlVisit_ampm']")).sendKeys("PM");
	    d.findElement(By.xpath("//input[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_txtTransactionId']")).sendKeys("!@#^#^$&%^*^&(&(#%@%@%");
	    d.findElement(By.xpath("//textarea[@id='cs_comments']")).sendKeys("testing purpose");
	    
	    d.findElement(By.xpath("//input[@id='txtIOSVersion']")).sendKeys("23.54");
	    d.findElement(By.xpath("//input[@id='txtSubwayAppVersion']")).sendKeys("123qwe");
	    d.findElement(By.xpath("//a[normalize-space()='Submit']")).sendKeys(Keys.ENTER);
	}
	
	/*@Test(priority=2)
	public void mobileandroid()
	{
		d.get("https://swqe.test.subway.com/en-us/contactus/guestcare");
		
		d.findElement(By.xpath("//span[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_myWaySpan']//sup[contains(text(),'®')]")).sendKeys(Keys.ENTER);
		d.findElement(By.xpath("//input[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_btnYourDigitalOrder_MobileAppAD']")).sendKeys(Keys.ENTER);
		d.findElement(By.xpath("//input[@id='txtFirstName']")).sendKeys("usha");
		d.findElement(By.xpath("//input[@id='txtLastName']")).sendKeys("test1");
	    d.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("test@u.com");
	    d.findElement(By.xpath("//input[@id='txtConfirmEmail']")).sendKeys("test@u.com");
	    d.findElement(By.xpath("//input[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_txtPhoneNumber']")).sendKeys("1234567890");
	    d.findElement(By.xpath("//select[@id='ddlState']")).sendKeys("Guam");
	    d.findElement(By.xpath("//input[@id='storeNumber']")).sendKeys("82589");
	    d.findElement(By.xpath("//input[@id='satelliteNumber']")).sendKeys("02");
	   // d.findElement(By.xpath("//img[@title='Select date']")).sendKeys(Keys.ENTER);
	    //d.findElement(By.xpath("//a[normalize-space()='19']")).sendKeys(Keys.ENTER);
	    d.findElement(By.xpath("//select[@id='ddlVisitTimeHr']")).sendKeys("6");
	    d.findElement(By.xpath("//select[@id='ddlVisitTimeMin']")).sendKeys("15");
	    d.findElement(By.xpath("//select[@id='ddlVisit_ampm']")).sendKeys("PM");
	    d.findElement(By.xpath("//input[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_txtTransactionId']")).sendKeys("!@#^#^$&%^*^&(&(#%@%@%");
	    d.findElement(By.xpath("//textarea[@id='cs_comments']")).sendKeys("testing purpose");
	    d.findElement(By.xpath("//input[@id='txtAndroidVersion']")).sendKeys("456rty");
	    d.findElement(By.xpath("//input[@id='txtSubwayAppVersion']")).sendKeys("123qwe");
	    d.findElement(By.xpath("//a[normalize-space()='Submit']")).sendKeys(Keys.ENTER);
	}
	
	@Test(priority=3)
	public void laptopdesktop()
	{
		d.get("https://www.subway.com/en-US/ContactUs/GuestCare");
		
		d.findElement(By.xpath("//span[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_myWaySpan']//sup[contains(text(),'®')]")).sendKeys(Keys.ENTER);
		d.findElement(By.xpath("//input[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_btnYourDigitalOrder_WebDL']")).sendKeys(Keys.ENTER);
		d.findElement(By.xpath("//input[@id='txtFirstName']")).sendKeys("usha");
		d.findElement(By.xpath("//input[@id='txtLastName']")).sendKeys("test1");
	    d.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("test@u.com");
	    d.findElement(By.xpath("//input[@id='txtConfirmEmail']")).sendKeys("test@u.com");
	    d.findElement(By.xpath("//input[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_txtPhoneNumber']")).sendKeys("1234567890");
	    d.findElement(By.xpath("//select[@id='ddlState']")).sendKeys("Guam");
	    d.findElement(By.xpath("//input[@id='storeNumber']")).sendKeys("82589");
	    d.findElement(By.xpath("//input[@id='satelliteNumber']")).sendKeys("02");
	   // Thread.sleep(2000);
	// d.findElement(By.xpath(calendarpicker)).click();
	   
	   // d.findElement(By.xpath(date)).click();
	    d.findElement(By.xpath("//select[@id='ddlVisitTimeHr']")).sendKeys("6");
	    d.findElement(By.xpath("//select[@id='ddlVisitTimeMin']")).sendKeys("15");
	    d.findElement(By.xpath("//select[@id='ddlVisit_ampm']")).sendKeys("PM");
	    d.findElement(By.xpath("//input[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_txtTransactionId']")).sendKeys("!@#^#^$&%^*^&(&(#%@%@%");
	    d.findElement(By.xpath("//textarea[@id='cs_comments']")).sendKeys("testing purpose");
	    d.findElement(By.xpath("//select[@id='ddlBrowserType']")).sendKeys("Google Chrome");
	    d.findElement(By.xpath("//a[normalize-space()='Submit']")).sendKeys(Keys.ENTER);	
	}
	
	@Test(priority=4)
	public void mobiledevice()
	{
		d.get("https://swqe.test.subway.com/en-us/contactus/guestcare");
		
		d.findElement(By.xpath("//span[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_myWaySpan']//sup[contains(text(),'®')]")).sendKeys(Keys.ENTER);
		d.findElement(By.xpath("//input[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_btnYourDigitalOrder_WebM']")).sendKeys(Keys.ENTER);
		d.findElement(By.xpath("//input[@id='txtFirstName']")).sendKeys("usha");
		d.findElement(By.xpath("//input[@id='txtLastName']")).sendKeys("test1");
	    d.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("test@u.com");
	    d.findElement(By.xpath("//input[@id='txtConfirmEmail']")).sendKeys("test@u.com");
	    d.findElement(By.xpath("//input[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_txtPhoneNumber']")).sendKeys("1234567890");
	    d.findElement(By.xpath("//select[@id='ddlState']")).sendKeys("Guam");
	    d.findElement(By.xpath("//input[@id='storeNumber']")).sendKeys("82589");
	    d.findElement(By.xpath("//input[@id='satelliteNumber']")).sendKeys("02");
	   // d.findElement(By.xpath("//img[@title='Select date']")).sendKeys(Keys.ENTER);
	    //d.findElement(By.xpath("//a[normalize-space()='19']")).sendKeys(Keys.ENTER);
	    d.findElement(By.xpath("//select[@id='ddlVisitTimeHr']")).sendKeys("6");
	    d.findElement(By.xpath("//select[@id='ddlVisitTimeMin']")).sendKeys("15");
	    d.findElement(By.xpath("//select[@id='ddlVisit_ampm']")).sendKeys("PM");
	    d.findElement(By.xpath("//input[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_txtTransactionId']")).sendKeys("!@#^#^$&%^*^&(&(#%@%@%");
	    d.findElement(By.xpath("//textarea[@id='cs_comments']")).sendKeys("testing purpose");
	    d.findElement(By.xpath("//select[@id='ddlBrowserType']")).sendKeys("Google Chrome");
	    d.findElement(By.xpath("//a[normalize-space()='Submit']")).sendKeys(Keys.ENTER);	
	}
	
	@Test(priority=5)
	public void mywayrewardsother()
	{
		d.get("https://swqe.test.subway.com/en-us/contactus/guestcare");
		
		d.findElement(By.xpath("//a[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_btnRewardsProgram']")).sendKeys(Keys.ENTER);
		d.findElement(By.xpath("//input[@id='btnRewardsProgram_OtherQuestions']")).sendKeys(Keys.ENTER);
		d.findElement(By.xpath("//input[@id='txtFirstName']")).sendKeys("usha");
		d.findElement(By.xpath("//input[@id='txtLastName']")).sendKeys("test1");
		d.findElement(By.xpath("//input[@id='txtAccountEmail']")).sendKeys("test@u.com");
	    d.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("test@u.com");
	    d.findElement(By.xpath("//input[@id='txtConfirmEmail']")).sendKeys("test@u.com");
	    d.findElement(By.xpath("//input[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_txtPhoneNumber']")).sendKeys("1234567890");
	    d.findElement(By.xpath("//select[@id='ddlState']")).sendKeys("Guam");
	    d.findElement(By.xpath("//input[@id='storeNumber']")).sendKeys("82589");
	    d.findElement(By.xpath("//input[@id='satelliteNumber']")).sendKeys("02");
	    d.findElement(By.xpath("//select[@id='ddlVisitTimeHr']")).sendKeys("6");
	    d.findElement(By.xpath("//select[@id='ddlVisitTimeMin']")).sendKeys("15");
	    d.findElement(By.xpath("//select[@id='ddlVisit_ampm']")).sendKeys("PM");
	    d.findElement(By.xpath("//input[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_txtTransactionId']")).sendKeys("!@#^#^$&%^*^&(&(#%@%@%");
	    d.findElement(By.xpath("//textarea[@id='cs_comments']")).sendKeys("testing purpose");
	    d.findElement(By.xpath("//a[normalize-space()='Submit']")).sendKeys(Keys.ENTER);
	    
	    }
	
	@Test(priority=6)
	public void giftcadrslostordamaged()
	{
		d.get("https://swqe.test.subway.com/en-us/contactus/guestcare");
		
		d.findElement(By.xpath("//input[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_btnGiftCards']")).sendKeys(Keys.ENTER);
		d.findElement(By.xpath("//input[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_btnGiftcard_Lsd']")).sendKeys(Keys.ENTER);
		d.findElement(By.xpath("//input[@id='txtFirstName']")).sendKeys("usha");
		d.findElement(By.xpath("//input[@id='txtLastName']")).sendKeys("test1");
		d.findElement(By.xpath("//input[@id='txtAccountEmail']")).sendKeys("test@u.com");
		d.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("test@u.com");
	    d.findElement(By.xpath("//input[@id='txtConfirmEmail']")).sendKeys("test@u.com");
	    d.findElement(By.xpath("//input[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_txtPhoneNumber']")).sendKeys("1234567890");
	    d.findElement(By.xpath("//select[@id='ddlState']")).sendKeys("Guam");
	    d.findElement(By.xpath("//input[@id='storeNumber']")).sendKeys("82589");
	    d.findElement(By.xpath("//input[@id='satelliteNumber']")).sendKeys("02");
	    d.findElement(By.xpath("//select[@id='ddlVisitTimeHr']")).sendKeys("6");
	    d.findElement(By.xpath("//select[@id='ddlVisitTimeMin']")).sendKeys("15");
	    d.findElement(By.xpath("//select[@id='ddlVisit_ampm']")).sendKeys("PM");
	    d.findElement(By.xpath("//input[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_txtTransactionId']")).sendKeys("!@#^#^$&%^*^&(&(#%@%@%");
	    d.findElement(By.xpath("//input[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_GiftCardLastFour']")).sendKeys("7367");
	    d.findElement(By.xpath("//textarea[@id='cs_comments']")).sendKeys("testing purpose");
	    d.findElement(By.xpath("//a[normalize-space()='Submit']")).sendKeys(Keys.ENTER);
	}*/
		
		
		
	
}
