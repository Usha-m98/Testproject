package steps;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pagefactory.Homepage_PF;
import pagefactory.LoginPage_PF;

public class LoginDemoSteps_PF 
{
	WebDriver d=null;
	LoginPage_PF login1;
	Homepage_PF home;
	
	@Given("browser is open")
	public void browser_is_open() 
	{
		System.out.println("start");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\usham\\eclipse\\cucumberjava\\src\\test\\resources\\Drivers\\chromedriver.exe");
		d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	d.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);   
	}

	@And("user is on login page")
	public void user_is_on_login_page() 
	{
	   d.navigate().to("https://example.testproject.io/web/");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username,String password) 
	{
		login1=new LoginPage_PF(d);
		login1.enterusername(username);
		login1.enterpassword(password);
		
	    //d.findElement(By.id("name")).sendKeys(username);
	    //d.findElement(By.id("password")).sendKeys(password);
	   
	}
	@And("user clicks on login")
	public void user_clicks_on_login() 
	{
		login1.clicklogin();
		 //d.findElement(By.id("login")).click();
	}

	@Then("user navigates to next page")
	public void user_navigates_to_next_page() 
	{
		home.logoutisdisplayed();
		//d.findElement(By.id("logour")).isDisplayed();
	}


}
