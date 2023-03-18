 package Testngconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GropuExec {
	
	
  @Test(groups={"smoke"})
  public void f() {
	  
	  System.out.println("hi f method");
  }
  
  
  
 @Test(groups={"smoke"})
  public void b() {
	  
	  System.out.println("hi b method");
	  System.setProperty("WebDriver.gecko.driver", "Users/Krishna/eclipse-workspace/MYAUTOMATION/src/main/java/driver/geckodriver");
	    WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
	  
  }
  
  
  
  @Test(groups={"functinal"})
  public void c() {
	  
	  
	  System.out.println("hi c method");
	  System.setProperty("WebDriver.gecko.driver", "Users/Krishna/eclipse-workspace/MYAUTOMATION/src/main/java/driver/geckodriver");
	    WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
	}
	  
	  
  }
  
  
  
  
  
  

