import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class WorkingwithJavaScriptexecutor {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		WebElement amazon = driver.findElement(By.xpath("//*[@class='navFooterLine navFooterLinkLine navFooterPadItemLine']"));
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView();", amazon);
        // amazon.click();
        TakesScreenshot ts = (TakesScreenshot)driver;
        File Src = ts.getScreenshotAs(OutputType.FILE);
        
        File d = new File("E:\\for_automation\\Practie1\\amazon.png");
        Files.copy(Src, d);
	}

}
 