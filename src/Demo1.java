import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo1 extends Demo{
	public static void main(String[] args) {
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://testpages.eviltester.com/styled/validation/input-validation.html");
	driver.findElement(By.id("firstname")).sendKeys("joseph");
	driver.findElement(By.id("surname")).sendKeys("davidericherla");
	driver.findElement(By.id("age")).sendKeys("20");
	WebElement ele = driver.findElement(By.id("country"));
	Select st = new Select(ele);
	st.selectByVisibleText("India");
	driver.findElement(By.id("notes")).sendKeys("hello");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	 }
	}

