package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import io.cucumber.java.en.*;

public class LoginDemoSteps_POM 
{
//	WebDriver d=null;
//	LoginPage login;
//	
//	@Given("browser is open")
//	public void browser_is_open() 
//	{
//		System.out.println("start");
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\usham\\eclipse\\cucumberjava\\src\\test\\resources\\Drivers\\chromedriver.exe");
//		d=new ChromeDriver();
//		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	d.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);   
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() 
//	{
//		
//	   d.navigate().to("https://example.testproject.io/web/");
//	}
//
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String username,String password) 
//	{
//	   
//		login=new LoginPage(d);
//		login.username(username);
//		login.password(password);
//		
//		
//		//d.findElement(By.id("name")).sendKeys(username);
//	    //d.findElement(By.id("password")).sendKeys(password);
//	   
//	}
//	@And("user clicks on login")
//	public void user_clicks_on_login() 
//	{
//		login.click();
//		 //d.findElement(By.id("login")).click();
//	}
//
//	@Then("user navigates to next page")
//	public void user_navigates_to_next_page() 
//	{
//		login.checklogout();
//		d.findElement(By.id("logout")).isDisplayed();
//	}
//

}
