import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub                                                                             n                                                                                                                                                                                                                                                              

		WebDriver driver = new EdgeDriver ();
		//implicit wait
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
                                                                                                                                                                                                                                                                                                                                                            		
		driver.get("https://demoqa.com/progress-bar");
		
		driver.findElement(By.id("startStopButton")).click();
		
		WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resetButton") ));
		
	driver.findElement(By.id("resetButton")).click();
	
	}

}
