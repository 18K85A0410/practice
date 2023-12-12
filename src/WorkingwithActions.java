import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingwithActions {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new EdgeDriver  ();
	driver.get("https://www.meesho.com");
	Actions act = new Actions(driver);
WebElement men = driver.findElement(By.xpath("(//div[@class='NavBarDesktop__Subtitle-sc-xsryom-0 izctWK'])[3]"));
    act.moveToElement(men).perform();
    Thread.sleep(3000);
     
    
    act.doubleClick().perform();
    driver.switchTo().newWindow(WindowType.TAB);
   driver.manage().window().maximize();
    driver.get("https://demoqa.com/droppable");
    WebElement  drag = driver.findElement(By.xpath("//div[@id='draggable']"));
    WebElement drop = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
    act.clickAndHold(drag).perform();
    Thread.sleep(3000);
    act.dragAndDrop(drag, drop).perform();
   driver.get("https://demo.automationtesting.in/Static.html");
    
     
    
    
   
    
    
    
    
    
    
    
    
    
    
    driver.switchTo().newWindow(WindowType.TAB);
    driver.get("httpS://demo.automationtesting.in/Static.html");
    
	
	
}
}
