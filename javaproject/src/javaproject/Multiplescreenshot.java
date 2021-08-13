package javaproject;

import java.io.File;
import java.io.IOException;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Multiplescreenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.navigate().to("https://swqe.test.subway.com/en-us/contactus/guestcare");
		JavascriptExecutor exe=(JavascriptExecutor)d;
        exe.executeScript("window.scrollTo(0,0)");
       Boolean check = (Boolean)exe.executeScript("return document.documentElement.scrollHeight>document.documentElement.clientHeight");
        Long scrollH = (Long)exe.executeScript("return document.documentElement.scrollHeight");
        Long clientH = (Long)exe.executeScript("return document.documentElement.clientHeight");
        int index=1;
        if(check.booleanValue())
        {
        	while(scrollH.intValue()>0) {
        		
        		TakesScreenshot scrShot =((TakesScreenshot)d);
        	    File Src=scrShot.getScreenshotAs(OutputType.FILE);
        	    File Dest=new File("./screenshots/screen-" +index+".jpg");
        	    FileHandler.copy(Src, Dest);
        	    exe.executeScript("window.scrollTo(0,"+ clientH * index +")");
        	    scrollH=scrollH-clientH;
        	    index++;
        	}
        }
        System.out.println("Taken screenshot successfully");
	}

}
