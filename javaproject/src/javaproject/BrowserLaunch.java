package javaproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.google.com");
		String title = d.getTitle();
		System.out.println(title);
		String url = d.getCurrentUrl();
		System.out.println(url);
		
	}

}
