import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Links {
public static void main(String [] args) {
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.google.com");
	List<WebElement> links = driver.findElements(By.tagName("a"));
	int totallinks = links.size();
	System.out.println("The total links = "+totallinks);
 	int count = 0;
	for(int i = 0;i<totallinks;i++) {
		if(links.get(i).isDisplayed()) {
			count++;
		} 
	}
	int visiblelinks = count;
	System.out.println("The visable links = "+visiblelinks);
	int invisiblelinks = totallinks-visiblelinks;
	System.out.println("The invisible links = "+invisiblelinks);
	
	 
}
}
 