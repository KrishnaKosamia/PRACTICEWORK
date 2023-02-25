import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bestclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.Chrome.driver","Users/Krishna/eclipse-workspace/MYAUTOMATION/src/main/resources/driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		///Users/Krishna/eclipse-workspace/MYAUTOMATION/src/main/resources/driver/chromedriver
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("selenium"+Keys.ENTER);
		Thread.sleep(8000);
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("selenium - Google Search")) {
			System.out.println("test pass");
		}
		else {
			System.out.println("test fail");
		}
		List<WebElement> findElements = driver.findElements(By.tagName("a"));
		
		for(WebElement ele:findElements) {
			
			System.out.println(ele.getText());
			
		}
		
		//link /text 
		
		
		driver.close();

	}

}
