import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Countinglinks {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.google.com");
	//count total links
	List<WebElement> links = driver.findElements(By.tagName("a"));
	int totallinks = links.size();
	System.out.println("the totsl links is "+totallinks); 
	//count visable links
	int visableCount = 0;
	for(int i = 0;i<links.size();i++) {
		if(links.get(i).isDisplayed()) {
			visableCount++;
		}
	}
	System.out.println("The visable links count is "+visableCount); 
	System.out.println ("the invisable count of links = "+(totallinks-visableCount));
	
	
	}

}
