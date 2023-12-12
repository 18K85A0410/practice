 import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class WorkingwithValidationcommands {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();           
		driver.get("http://demowebshop.tricentis.com");
   WebElement logo = driver.findElement(By.xpath("(//img)[1]"));
   boolean display = logo.isDisplayed();
   System.out.println("The logo displaying is "+display);
   WebElement radio = driver.findElement(By.xpath("//input[@id='pollanswers-1']"));
   radio.click();
   boolean select1 = radio.isSelected();
   System.out.println("The radio before select is =  "+select1);
   
   
   boolean select2 = radio.isSelected();
   System.out.println("the radio after select is = "+select2);
   
   WebElement submit = driver.findElement(By.xpath("//input[@id='vote-poll-1']"));
   submit.click();
   
   boolean enable = submit.isEnabled();
   System.out.println("The submit button enabled is = "+enable);
	
	}

}
