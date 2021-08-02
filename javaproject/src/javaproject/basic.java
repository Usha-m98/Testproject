package javaproject;


import java.util.Set;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class basic {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("http://www.demo.guru99.com/v4/");
		 // ele = d.findElement(By.name("uid")).sendKeys("mngr311660");
		Set<String> a = d.getWindowHandles();
		  int count = a.size();
		  System.out.println(count);
		  for(String b:a)
		  {
			  d.switchTo().window(b);
			  String title = d.getTitle();
	          System.out.println(title);
	          Thread.sleep(2000);
	          d.close();
		  }
		
		
	}
	

}
