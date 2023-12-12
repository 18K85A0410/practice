import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDynamicWebTable{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dezlearn.com/webtable-example/");
		WebElement table = driver.findElement(By.xpath("//table[@class='tg']"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println("the total row count is = "+rows.size());
		System.out.println("--------------------------------------");
		for(int i = 0;i<rows.size();i++) {
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			Thread.sleep(3000);
			for(int j = 0;j<cols.size();j++) {
				if(i==1&&j==2) {
					cols.get(j).findElement(By.tagName("input")).click();
				}
				else if(i==1&&j==3) {
					cols.get(j).findElement(By.tagName("input")).click();
				}
				else if(i==1&&j==4) {
					WebElement dropdown = cols.get(j).findElement(By.tagName("select"));
					Select st = new Select(dropdown);
					st.selectByVisibleText("Sedan");
				}
				else if(i==1&&j==5) {
					cols.get(j).findElement(By.tagName("input")).sendKeys("Joseph");
				}
				else if(i==2&&j==2) {
					cols.get(j).findElement(By.tagName("input")).click();
				}
				else if(i==2&&j==3) {
					cols.get(j).findElement(By.tagName("input")).click();
				}
				else if(i==2&&j==4) {
					WebElement dropdown = cols.get(j).findElement(By.tagName("select"));
					Select st = new Select(dropdown);
					st.selectByVisibleText("Suv");
				}
				else if(i==2&&j==5) {
					cols.get(j).findElement(By.tagName("input")).sendKeys("David");
				}
				else if(i==3&&j==2) {
					cols.get(j).findElement(By.tagName("input")).click();
				}
				else if(i==3&&j==3) {
					cols.get(j).findElement(By.tagName("input")).click();
				}
				else if(i==3&&j==4) {
					WebElement dropdown = cols.get(j).findElement(By.tagName("select"));
					Select st = new Select(dropdown);
					st.selectByVisibleText("Sports");
				}
				else if(i==3&&j==5) {
					cols.get(j).findElement(By.tagName("input")).sendKeys("Martin");
				}
				else if(i==4&&j==2) {
					cols.get(j).findElement(By.tagName("input")).click();
				}
				else if(i==4&&j==3) {
					cols.get(j).findElement(By.tagName("input")).click();
				}
				else if(i==4&&j==4) {
					WebElement dropdown = cols.get(j).findElement(By.tagName("select"));
					Select st = new Select(dropdown);
					st.selectByVisibleText("Hatchback");
					
				}
				else if(i==4&&j==5) {
					cols.get(j).findElement(By.tagName("input")).sendKeys("Sherly");
				}
				else if(i==5&&j==2) {
					cols.get(j).findElement(By.tagName("input")).click();
				}
				else if(i==5&&j==3) {
					cols.get(j).findElement(By.tagName("input")).click();
				}
				else if(i==5&&j==4) {
					WebElement dropdown = cols.get(j).findElement(By.tagName("select"));
					Select st = new Select(dropdown);
					st.selectByVisibleText("Sedan");
				}
				else if(i==5&&j==5) {
					cols.get(j).findElement(By.tagName("input")).sendKeys("Vijaya");
				}
				else if(i==6&&j==2) {
					cols.get(j).findElement(By.tagName("input")).click();
				}
				else if(i==6&&j==3) {
					cols.get(j).findElement(By.tagName("input")).click();
				}
				else if(i==6&&j==4) {
					WebElement dropdown = cols.get(j).findElement(By.tagName("select"));
					Select st = new Select(dropdown);
					st.selectByVisibleText("Suv");
				}
				else if(i==6&&j==5) {
					cols.get(j).findElement(By.tagName("input")).sendKeys("Wife");
					
					
				}
				else if(i==1&&j==1) {
					cols.get(j).getText();
					driver.quit();
				}
			}
			
		}
		
		
		
	}
}