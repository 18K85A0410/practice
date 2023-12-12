import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class WorkingwithDynamicDropdown {
	public static void main(String [] args) throws InterruptedException {
	WebDriver driver = new EdgeDriver();	
	driver.get("https://www.google.com");
	WebElement ele = driver.findElement(By.xpath("//*[@class='gLFyf']"));
	ele.sendKeys("sivakrishna" );
	Thread.sleep(3000);
	
	//how to handle total dropdown
	List<WebElement> allElements = driver.findElements(By.xpath("//div[@class='pcTkSc']"));
	System.out.println(allElements.size());
	
	for(int i = 0;i<allElements.size();i++) {
    	System.out.println(allElements.get(i).getText());
    	if(allElements.get(i).getText().contains("SivaKrishnapuram Temple")) {
        	allElements.get(i).click();
        	break;
    	}
	}
        	
         
	
	
	
	
	
	//how to count no. of elements in dynamic dropdown
	//List<WebElement> list = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
	// System.out.println("The list size = "+list.size());
	
	//get the names of list
   //(int i = 0;i<list.size();i++) {
    	//System.out.println(list.get(i).getText());
    	
	
	//}
	}
}
	

