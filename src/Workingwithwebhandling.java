import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
public class Workingwithwebhandling {
	public static void main(String [] args) {
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	
	WebElement joseph = driver.findElement(By.tagName("select"));
	Select dropdown = new Select(joseph);
	//how to get total dropdown elements count
	  List<WebElement> all = dropdown.getOptions();
	System.out.println("the dropdown count = "+all.size());
	
	for(int i = 0; i<all.size();i++) {
		System.out.println(all.get(i).getText());
	}
	dropdown.selectByVisibleText("India");
	}
  
}
