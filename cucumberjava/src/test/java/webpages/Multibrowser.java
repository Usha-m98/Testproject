package webpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Multibrowser 
{
 WebDriver d=null;
 
    @Parameters("browser")
    @BeforeTest
	public void openappln(String browser)
	{
		System.out.println("Browser name is:"+browser);
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			d=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			d=new FirefoxDriver();
		}
		d.manage().window().maximize();
	}
    
    @Test
    public void restaurantexperience()
    {
    	String date="//a[normalize-space()='4']";
        d.get("https://swqe.test.subway.com/en-us/contactus/guestcare");
	    d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);	


	    d.findElement(By.xpath("//input[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_btnRestaurantExperience']")).sendKeys(Keys.ENTER);
	    d.findElement(By.xpath("//input[@id='txtFirstName']")).sendKeys("usha");
	    d.findElement(By.xpath("//input[@id='txtLastName']")).sendKeys("test1");
	    d.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("test@u.com");
	    d.findElement(By.xpath("//input[@id='txtConfirmEmail']")).sendKeys("test@u.com");
	    d.findElement(By.xpath("//input[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_txtPhoneNumber']")).sendKeys("1234567890");
	    d.findElement(By.xpath("//select[@id='ddlState']")).sendKeys("Guam");
	    d.findElement(By.xpath("//input[@id='storeNumber']")).sendKeys("30303");
	    d.findElement(By.xpath("//input[@id='satelliteNumber']")).sendKeys("0");
	    WebElement ele = d.findElement(By.xpath("//img[@title='Select date']"));
	    JavascriptExecutor js=(JavascriptExecutor)d;
	    js.executeScript("arguments[0].click()", ele);
	    d.findElement(By.xpath(date)).sendKeys(Keys.ENTER);
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
    	String date="//a[normalize-space()='4']";
		
		d.get("https://swqe.test.subway.com/en-us/contactus/guestcare");
		d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);	
		
		WebDriverWait wait=new WebDriverWait(d,20);
	    WebElement ele1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_btnDigitalOrder']")));
	    ele1.click();
		/* WebElement ele1 = d.findElement(By.xpath("//input[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_btnDigitalOrder']"));
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("arguments[0].click()",ele1);*/
	  
	 d.findElement(By.xpath("//input[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_btnYourDigitalOrder_MobileAppIOS']")).sendKeys(Keys.ENTER);
	 
		 
		d.findElement(By.xpath("//input[@id='txtFirstName']")).sendKeys("usha");
		d.findElement(By.xpath("//input[@id='txtLastName']")).sendKeys("test1");
	    d.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("test@u.com");
	    d.findElement(By.xpath("//input[@id='txtConfirmEmail']")).sendKeys("test@u.com");
	    d.findElement(By.xpath("//input[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_txtPhoneNumber']")).sendKeys("1234567890");
	    d.findElement(By.xpath("//select[@id='ddlState']")).sendKeys("Guam");
	    d.findElement(By.xpath("//input[@id='storeNumber']")).sendKeys("82589");
	    d.findElement(By.xpath("//input[@id='satelliteNumber']")).sendKeys("02");
	    d.findElement(By.xpath("//img[@title='Select date']")).sendKeys(Keys.ENTER);
	    
	    d.findElement(By.xpath(date)).sendKeys(Keys.ENTER);
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
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		WebElement ele1 = d.findElement(By.xpath("//input[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_btnDigitalOrder']"));
		//ele1.click();
		WebDriverWait wait = new WebDriverWait(d,10);
		 wait.until(ExpectedConditions.elementToBeClickable(ele1));
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
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		
		 d.findElement(By.xpath("//input[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_btnDigitalOrder']")).sendKeys(Keys.ENTER);
		
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
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		WebElement ele2 = d.findElement(By.xpath("//input[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_btnDigitalOrder']"));
		//ele2.click();
		WebDriverWait wait = new WebDriverWait(d,10);
		 wait.until(ExpectedConditions.elementToBeClickable(ele2));
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
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		WebElement ele5 = d.findElement(By.xpath("//span[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_myWaySpan']"));
		WebDriverWait wait = new WebDriverWait(d,10);
		 wait.until(ExpectedConditions.elementToBeClickable(ele5));
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
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
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
	}
		
	@Test(priority=7)
	public void giftcardother()
	{
		d.get("https://swqe.test.subway.com/en-us/contactus/guestcare");
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		
		WebElement ele3 = d.findElement(By.xpath("//input[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_btnGiftCards']"));
		ele3.click();
		WebDriverWait wait = new WebDriverWait(d,10);
		 wait.until(ExpectedConditions.elementToBeClickable(ele3));
		d.findElement(By.xpath("//input[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_btnGiftcard_Oq']")).sendKeys(Keys.ENTER);
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
	}
	
	@Test(priority=8)
	public void menuproductsuggestions()
	{
		d.get("https://swqe.test.subway.com/en-us/contactus/guestcare");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		d.findElement(By.xpath("//input[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_btnMenuOther']")).sendKeys(Keys.ENTER);
		d.findElement(By.xpath("//input[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_btnMenuInquiries_Ps']")).sendKeys(Keys.ENTER);
	    d.findElement(By.xpath("//input[@id='txtFirstName']")).sendKeys("usha");
	    d.findElement(By.xpath("//input[@id='txtLastName']")).sendKeys("test1");
	    d.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("test@u.com");
	    d.findElement(By.xpath("//input[@id='txtConfirmEmail']")).sendKeys("test@u.com");
	    d.findElement(By.xpath("//input[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_txtPhoneNumber']")).sendKeys("1234567890");
	    d.findElement(By.xpath("//select[@id='ddlState']")).sendKeys("Guam");
	    d.findElement(By.xpath("//input[@id='storeNumber']")).sendKeys("30303");
	    d.findElement(By.xpath("//input[@id='satelliteNumber']")).sendKeys("0");
	    d.findElement(By.xpath("//select[@id='ddlVisitTimeHr']")).sendKeys("6");
	    d.findElement(By.xpath("//select[@id='ddlVisitTimeMin']")).sendKeys("15");
	    d.findElement(By.xpath("//select[@id='ddlVisit_ampm']")).sendKeys("PM");
	    d.findElement(By.xpath("//input[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_txtTransactionId']")).sendKeys("!@#^#^$&%^*^&(&(#%@%@%");
	    d.findElement(By.xpath("//textarea[@id='cs_comments']")).sendKeys("testing purpose");
	    d.findElement(By.xpath("//a[normalize-space()='Submit']")).sendKeys(Keys.ENTER);
	    
	}
		
	@Test(priority=9)
	public void menuother()
	{
		d.get("https://swqe.test.subway.com/en-us/contactus/guestcare");
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		
		WebElement ele4 = d.findElement(By.xpath("//input[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_btnMenuOther']"));
		//ele4.click();
		WebDriverWait wait = new WebDriverWait(d,10);
		 wait.until(ExpectedConditions.elementToBeClickable(ele4));
		d.findElement(By.xpath("//input[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_btnMenuInquiries_Oq']")).sendKeys(Keys.ENTER);
		d.findElement(By.xpath("//input[@id='txtFirstName']")).sendKeys("usha");
	    d.findElement(By.xpath("//input[@id='txtLastName']")).sendKeys("test1");
	    d.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("test@u.com");
	    d.findElement(By.xpath("//input[@id='txtConfirmEmail']")).sendKeys("test@u.com");
	    d.findElement(By.xpath("//input[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_txtPhoneNumber']")).sendKeys("1234567890");
	    d.findElement(By.xpath("//select[@id='ddlState']")).sendKeys("Guam");
	    d.findElement(By.xpath("//input[@id='storeNumber']")).sendKeys("30303");
	    d.findElement(By.xpath("//input[@id='satelliteNumber']")).sendKeys("0");
	    d.findElement(By.xpath("//select[@id='ddlVisitTimeHr']")).sendKeys("6");
	    d.findElement(By.xpath("//select[@id='ddlVisitTimeMin']")).sendKeys("15");
	    d.findElement(By.xpath("//select[@id='ddlVisit_ampm']")).sendKeys("PM");
	    d.findElement(By.xpath("//input[@id='v2main_0_insetcontainer_6cfebaeb54424adc88c25050d0487f87_0_txtTransactionId']")).sendKeys("!@#^#^$&%^*^&(&(#%@%@%");
	    d.findElement(By.xpath("//textarea[@id='cs_comments']")).sendKeys("testing purpose");
	    d.findElement(By.xpath("//a[normalize-space()='Submit']")).sendKeys(Keys.ENTER);
	    
	}*/
		
		
	


    
    
    @AfterTest
    public void closeappln()
    {
    	d.quit();
    	System.out.println("completed");
    }
}
