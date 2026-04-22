package practice1;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenShots {
      public static void main(String[] args)
      {
    	  WebDriver driver=new ChromeDriver();
    	  driver.manage().window().maximize();
    	  driver.get("https://orangehrm.com/30-day-free-trial");
    	  
    	  //Take full Screenshot
//    	  TakesScreenshot ts=(TakesScreenshot)driver;
//    	  File sourcefile=ts.getScreenshotAs(OutputType.FILE);
//    	  File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
//    	  sourcefile.renameTo(targetfile);//copy source file to target file
    	  
    	  
    	  //Take partially screenshot
//    	  WebElement contact=driver.findElement(By.xpath("//div[@class='contact-section']"));
//    	  
//    	  File sourcefile=contact.getScreenshotAs(OutputType.FILE);
//    	  File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\contactpage.png");
//    	  sourcefile.renameTo(targetfile);//copy source file to target file
    	  
    	  
    	  //Take a perticular element screenshot
    	  WebElement logo=driver.findElement(By.xpath("//img[@src='/public/_resources/themes/orangehrm/dist/images/OrangeHRM_Logo.svg']"));
    	  
    	  File sourcefile=logo.getScreenshotAs(OutputType.FILE);
    	  File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\logo.png");
    	  sourcefile.renameTo(targetfile);
      }
}
