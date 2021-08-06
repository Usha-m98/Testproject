package datadriven;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.io.FileHandler;
//
//
//import ru.yandex.qatools.ashot.AShot;
//import ru.yandex.qatools.ashot.Screenshot;

public class screenshot {

	
public static WebDriver driver;
public static void Screenshot1() throws IOException
{
    TakesScreenshot scrShot =((TakesScreenshot)driver);
    File Src=scrShot.getScreenshotAs(OutputType.FILE);
    File Dest=new File("./target/OrangeHRM.png");
    FileUtils.copyFile(Src, Dest);
}


public static void main(String[] args) throws InterruptedException, IOException {
   WebDriverManager.chromedriver().setup();
   driver=new ChromeDriver();
   driver.get("http://demo.guru99.com/v4/");
   Screenshot1();
}}
