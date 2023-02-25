import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("WebDriver.Chrome.driver","Users/Krishna/eclipse-workspace/MYAUTOMATION/src/main/resources/driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/sem/campaign/emailsignup/?campaign_id=13530334509&extra_1=s|c|547348909654|e|instagram%20%27|&placement=&creative=547348909654&keyword=instagram%20%27&partner_id=googlesem&extra_2=campaignid%3D13530334509%26adgroupid%3D126262421974%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1321618851291%26loc_physical_ms%3D9010783%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMI-8uaouCk_QIV1hvUAR32Pw_PEAAYASAAEgLA-fD_BwE");
		//imp code
		Thread.sleep(9000);
		
		WebElement emailtextbox = driver.findElement(By.name("emailOrPhone"));
		emailtextbox.sendKeys("jfjzjfdfgfgjfguf@bjgd.com");
		 
		WebElement findElement = driver.findElement(By.name("fullName"));
		 findElement.sendKeys("john henry");
		 
		 WebElement findElement1 = driver.findElement(By.name("username"));
		 findElement1.sendKeys("krishnakosamia");
		 driver.findElement(By.xpath("//a[text()='Learn More']")).click();
		 String windowHandle = driver.getWindowHandle();
		 Set<String> windowHandles = driver.getWindowHandles();
		 
		 for (String string : windowHandles) {
			 driver.switchTo().window(string);
			
		}
		 
		 System.out.println(driver.getTitle());
		 driver.switchTo().window(windowHandle);
		 System.out.println(driver.getTitle());
		 
		 
		
		
		
	
	
		

	}

}
