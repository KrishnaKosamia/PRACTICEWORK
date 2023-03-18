package testngcon;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest1 {
  @Test
  public void f() {
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("WebDriver.gecko.driver","/Users/Krishna/eclipse-workspace/MYAUTOMATION/src/main/java/driver/geckodriver");
	   WebDriver driver= new FirefoxDriver();
	    driver.get("https://www.google.com/");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("aftermethod");
	  System.setProperty("WebDriver.gecko.driver","/Users/Krishna/eclipse-workspace/MYAUTOMATION/src/main/java/driver/geckodriver");
	   WebDriver driver= new FirefoxDriver();
	    driver.get("https://www.google.com/");
	  
	  
  }

  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("beforeClass");
	  System.setProperty("WebDriver.gecko.driver","/Users/Krishna/eclipse-workspace/MYAUTOMATION/src/main/java/driver/geckodriver");
	   WebDriver driver= new FirefoxDriver();
	    driver.get("https://www.google.com/");
	  
	  
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("afterClass");
	  System.setProperty("WebDriver.gecko.driver","/Users/Krishna/eclipse-workspace/MYAUTOMATION/src/main/java/driver/geckodriver");
	   WebDriver driver= new FirefoxDriver();
	    driver.get("https://www.google.com/");
	  
	  
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("beforeTest");
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("afterTest");
	  
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("beforeSuite");
	  
  }

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("afterSuite");
	  
	  
  }

}
