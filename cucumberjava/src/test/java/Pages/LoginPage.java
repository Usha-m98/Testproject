package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	WebDriver d;
	By txt_username=By.id("name");

	By txt_password=By.id("password");

	By btn_loginbtn=By.id("login");
	
	By btn_logout=By.id("logout");
	
	
	public LoginPage(WebDriver d)
	{
		this.d=d;
	}
	
	public void username(String username)
	{
		d.findElement(txt_username).sendKeys(username);
	}
	
	public void password(String password)
	{
		d.findElement(txt_password).sendKeys(password);
	}
	
	public void click()
	{
		d.findElement(btn_loginbtn).click();
	}
	
	public void checklogout()
	{
		d.findElement(btn_logout).isDisplayed();
	}

	
	
}
