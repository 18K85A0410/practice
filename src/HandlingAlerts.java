import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {
public static void main(String[] args) throws InterruptedException {
	String text = "Josephdavid";
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	driver.findElement(By.xpath("//input[@id='name']")).sendKeys(text);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
	Thread.sleep(3000);
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
	System.out.println(driver.switchTo().alert().getText());
	Thread.sleep(3000);
	driver.switchTo().alert().dismiss();
	driver.quit();
		
}
}
