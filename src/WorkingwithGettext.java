import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class WorkingwithGettext {

	public static void main(String[] args) {
		
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.meesho.com/");
	WebElement men = driver.findElement(By.xpath("(//div[@class='NavBarDesktop__Subtitle-sc-xsryom-0 izctWK'])[3]"));
	String text = men.getText();
	System.out.println("the men text is = "+text);
	System.out.println("--------------------------------");
	List<WebElement> elements = driver.findElements(By.xpath("//div[@class='NavBarDesktop__Subtitle-sc-xsryom-0 izctWK']"));
    System.out.println("the element count is = "+elements.size());
    System.out.println("----------------------");
    System.out.println(elements.get(0).getText());
    System.out.println(elements.get(1).getText());
    System.out.println(elements.get(2).getText());
    
    System.out.println("----------------");
    for(int i = 0;i<elements.size();i++) {
    	System.out.println(elements.get(i).getText());
    }
    
    
	}

}
