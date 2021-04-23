package steps;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps 
{
  WebDriver d=null;	
	
//	@Given("browser is open")
//	public void browser_is_open() 
//	{
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\usham\\eclipse\\cucumberjava\\src\\test\\resources\\Drivers\\chromedriver.exe");
//		d=new ChromeDriver();
//		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		d.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
//	}
//
//	@And("user is on google search page")
//	public void user_is_on_google_search_page() 
//	{
//		//d.get("http://www.google.com");
//		d.navigate().to("http://www.google.com");
//	}
//
//	@When("user enters a text in search box")
//	public void user_enters_a_text_in_search_box() 
//	{
//		d.findElement(By.name("q")).sendKeys("guru99");
//		//System.out.println("three");
//	}
//
//	@And("hits enter")
//	public void hits_enter() 
//	{
//		d.findElement(By.name("q")).sendKeys(Keys.ENTER);
//
//		//System.out.println("four");
//	}
//
//	@Then("user is navigated to search results")
//	public void user_is_navigated_to_search_results() 
//	{
//	    d.getPageSource().contains("Guru99");
//	    d.close();
//	    d.quit();
//		//System.out.println("five");
//	}
//
//

}
