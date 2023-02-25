import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshort {
	  
	  public static void main(String[] args) throws IOException {
		

			
			System.setProperty("WebDriver.Chrome.driver","Users/Krishna/eclipse-workspace/MYAUTOMATION/src/main/resources/driver/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.co.in/");
			///Users/Krishna/eclipse-workspace/MYAUTOMATION/src/main/resources/driver/chromedriver
			
			driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("ATLANTADOWNTOWNPICTURES"+Keys.ENTER);
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			
			File srcfile = ts.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(srcfile,new File ("/Users/Krishna/eclipse-workspace/MYAUTOMATION/src/main/resources/Screenshot"+srcfile.getName()));
			
			
				driver.close();
				
				//screenshot
	}

}
