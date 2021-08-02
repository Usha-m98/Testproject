package javaproject;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolldown {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://www.demo.guru99.com/v4/");
        JavascriptExecutor js=(JavascriptExecutor) d;
        for(int i=0;i<3;i++)
        {
        	js.executeScript("window.scrollBy(0,500)");
        	Thread.sleep(1000);
       	 }
        Thread.sleep(1000);
        for(int i=0;i<3;i++)
        {
        	js.executeScript("window.scrollBy(0,-500)");
        	Thread.sleep(1000);
       	 }
	}

}
