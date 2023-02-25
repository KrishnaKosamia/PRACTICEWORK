import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
	
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("WebDriver.Chrome.driver","Users/Krishna/eclipse-workspace/MYAUTOMATION/src/main/resources/driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		///Users/Krishna/eclipse-workspace/MYAUTOMATION/src/main/resources/driver/chromedriver
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("selenium"+Keys.ENTER);
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		//navigation method
		//navigation atlke disha batavanu kam
		//kare.and a backword/ forword
		
		
	}

}
