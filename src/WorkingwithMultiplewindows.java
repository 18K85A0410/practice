import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class WorkingwithMultiplewindows {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
	 	driver.get("https://www.naukri.com");
	 	  String parent = driver.getWindowHandle();
		System.out.println(parent);
	 	
		driver.findElement(By.xpath("//a[@id='register_Layer']")).click();
		driver.findElement(By.xpath("//button[@class='socialbtn google resman-btn-tertiary resman-btn-medium']")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		System.out.println(allWindows.size());
		for(String child:allWindows) {
			System.out.println(child);
			if(!parent.equals(allWindows)) {
			driver.switchTo().window(child);
			}
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("Joseph");
		TakesScreenshot tss = (TakesScreenshot)driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File dst = new File("E:\\for_automation\\Practie1\\Screenshot.png");
		Files.copy(src, dst);
																																																									
	}

}
