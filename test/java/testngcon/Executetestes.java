package testngcon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Executetestes extends Baseteste{
  private static final int ENTER = 0;

@Test
  public void f() {
	  
	//*driver.findElements(By.xpath("//input[@aria-label='Search']")).sendkeys("selenium"+ Keys.ENTER);
	 
	driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("selenium"+Keys.ENTER);
	  
  }
}