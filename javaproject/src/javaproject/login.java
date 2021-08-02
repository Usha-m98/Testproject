package javaproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("http://www.demo.guru99.com/v4/");
	d.findElement(By.name("uid")).sendKeys("mngr311660");
	d.findElement(By.name("password")).sendKeys("ysUhEnE");
	d.findElement(By.name("btnLogin")).click();
	
	
	}

}
