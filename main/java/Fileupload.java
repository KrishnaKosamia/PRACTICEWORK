import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.Chrome.driver","Users/Krishna/eclipse-workspace/MYAUTOMATION/src/main/resources/driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.findElement(By.xpath("//input[contains(@id,'html5')]")).sendKeys("/Users/Krishna/eclipse-workspace/MYAUTOMATION/src/main/resources/Files/sample.pdf");
		
		
		////input[contains(@id,'html5')]
		

	}

}
