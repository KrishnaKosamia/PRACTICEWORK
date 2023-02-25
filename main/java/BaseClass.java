import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("WebDriver.Chrome.driver","Users/Krishna/eclipse-workspace/MYAUTOMATION/src/main/resources/driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		//driver.findElement(By.linkText("Support")).click();
		//driver.findElement(By.cssSelector("a[id='navbarDropdown']")).click();
		//(//a[@id='navbarDropdown'])[2]
		driver.findElement(By.xpath("(//a[@id='navbarDropdown'])[2]")).click();
		Thread.sleep(9000);

		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(srcfile,new File ("/Users/Krishna/eclipse-workspace/MYAUTOMATION/src/main/resources/Screenshot"+srcfile.getName()));
		
		
			driver.close();
		//driver.close();
			
			//locaters:/
		

	}

}
