import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;
public class WorkingwithScreenshot {
	public static void main(String [] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.xnxx.com");
		TakesScreenshot tss = (TakesScreenshot)driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		/*File dst = new File("E:\\for_automation\\Practie1\\flipkart.png");
		Files.copy(src, dst);*/
		 for(int i =0;i<5;i++) {
		File dst = new File("E:\\for_automation\\Practie1\\flipkart.png"+i);
		Files.copy(src, dst);
		 }
		 
		
		}
	}


