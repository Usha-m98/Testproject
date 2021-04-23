package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage_PF 
{
  @FindBy(id="logout")
  WebElement loggedout;
 
  WebDriver d;
	public  Homepage_PF(WebDriver d)
	{
		this.d=d;
		PageFactory.initElements(d, this);
	}
  public void logoutisdisplayed()
  {
	  loggedout.isDisplayed();
  }
}
