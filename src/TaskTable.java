import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskTable {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dezlearn.com/webtable-example/");
		WebElement table = driver.findElement(By.xpath("//table[@class='tg']"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		  System.out.println("the row count is = "+rows.size());
		System.out.println("-------------------------------------");
		
		for(int i = 1;i<rows.size();i++) {
			
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			
			 for(int j = 0;j<cols.size();j++) {
				 if(i==1&&j==3) {
					 cols.get(j).findElement(By.tagName("input")).click();
				 }
				 if(i==1&&j==2) {
					 cols.get(j).findElement(By.tagName("input")).click();
				 }
			 
					 if(i==5&&j==4) {
						 WebElement db = cols.get(j).findElement(By.tagName("select"));
						 Select select = new Select(db);
						 select.selectByVisibleText("Suv");
						 
					 }
					 else if(i==1&&j==5) {
						 cols.get(j).findElement(By.xpath("//input[@type='text']")).sendKeys("complete");
					 }
					 else if(i==2&&j==3) {
						 cols.get(j).findElement(By.tagName("input")).click();			 }
					 
				 }
			 
			 }
		}
		
	}


