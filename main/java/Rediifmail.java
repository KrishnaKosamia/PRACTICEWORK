import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediifmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("WebDriver.Chrome.driver","Users/Krishna/eclipse-workspace/MYAUTOMATION/src/main/resources/driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("hyuio@gmail.com");
		driver.findElement(By.id("password")).sendKeys("hjfhguhg");
		driver.findElement(By.name("proceed")).click();
		boolean displayed = driver.findElement(By.tagName("p")).isDisplayed();
		System.out.println(displayed);
		driver.close();
		
		//element display

	}

}
