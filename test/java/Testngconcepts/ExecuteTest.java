package Testngconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ExecuteTest extends BaseTest{
  @Test
  public void f() {
	  
	  driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("selenium"+Keys.ENTER);
	  //driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
	  
	  
	 
	  
	  
	  
	  
	  
	  
  }
}
