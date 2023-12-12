import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Staticdropdown {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com");
    WebElement ele = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
    ele.click();
    Thread.sleep(3000);
    WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
    Select dropdown1 = new Select(day);
    dropdown1.selectByValue("1");
    Thread.sleep(3000);
    WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
    Select dropdown2 = new Select(month);
    dropdown2.deselectByIndex(3);
    Thread.sleep(3000);
    WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
    Select dropdown3 = new Select(year);
    dropdown2.selectByVisibleText("2003");
    Thread.sleep(3000);
    driver.quit();
	}
	
	

}
