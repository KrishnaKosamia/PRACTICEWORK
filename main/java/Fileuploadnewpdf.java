import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploadnewpdf {
	
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("WebDriver.Chrome.driver","Users/Krishna/eclipse-workspace/MYAUTOMATION/src/main/resources/driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.ilovepdf.com/pdf_to_word");
		//driver.findElement(By.xpath("//input[contains(@id,'html5')]")).sendKeys("/Users/Krishna/eclipse-workspace/MYAUTOMATION/src/main/resources/Files/dummy.pdf");
		
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.findElement(By.xpath("//input[contains(@id,'html5')]")).sendKeys("/Users/Krishna/eclipse-workspace/MYAUTOMATION/src/main/resources/Files/sample4.docx");
		Thread.sleep(3000);
		driver.close();
		
	}

}
