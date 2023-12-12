package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		 driver = new ChromeDriver();
	}
  @Test(priority=1)
  public void linkTest() {
	  driver.get("https://www.google.com");
  }
  @Test(priority=2)
  public void titleTest(){
	  String actualTitle = driver.getTitle();
	  String expTitle = "Google";
	  String message = "something went wrong";
	  Assert.assertEquals(actualTitle, expTitle, message);
	  
  }
  @AfterTest
  public void tearDown() {
  driver.close();
  }
} 