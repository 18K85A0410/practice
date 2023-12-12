import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingWebtable {

	public static void main(String[] args) {
    WebDriver driver = new EdgeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.google.com");
    driver.findElement(By.xpath("(//textarea[@name='q'])[1]")).sendKeys("hello"); 
   /* WebElement table = driver.findElement(By.xpath("//table[@class='tg']"));
    List<WebElement> rows = table.findElements(By.tagName("tr"));
    System.out.println("the total rows are = "+rows.size());
    for(int i = 1;i<=rows.size();i++) {
    	System.out.println(rows.get(i).getText());
    }
    List<WebElement> heads = table.findElements(By.tagName("th"));
    System.out.println("thr total heads is =" +heads.size());
	for(WebElement webElement:heads) {
		System.out.println(webElement.getText());
	}
	List<WebElement> cols = table.findElements(By.tagName("td"));
	System.out.println("the total cols is = "+cols.size());
	for(WebElement webElement:cols) {
		System.out.println(webElement.getText());
	*/}
	
	

}
