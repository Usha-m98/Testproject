package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF 
{
	@FindBy(id="name")
	WebElement un;
	
	@FindBy(id="password")
	WebElement pwd;
	
	@FindBy(id="login")
	WebElement logged;
	
	WebDriver d;
	public  LoginPage_PF(WebDriver d)
	{
		this.d=d;
		PageFactory.initElements(d,this);
	}
	
	public void enterusername(String username)
	{
		un.sendKeys("username");
	}
	public void enterpassword(String passsword)
	{
		pwd.sendKeys("password");
	}
	public void clicklogin()
	{
		logged.click();
	}
}
