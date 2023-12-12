
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
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

public class WorkingwithFileUpload{
	public static void main(String[] args) throws InterruptedException, AWTException, IOException{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
	driver.get("https://www.naukri.com");
	driver.findElement(By.xpath("//a[@id='register_Layer']")).click();
	 
	WebElement uploadResume = driver.findElement(By.xpath("//button[@class='uploadResume resman-btn-primary resman-btn-small']"));
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("arguments[0].scrollIntoView;", uploadResume);
	uploadResume.click();
	String path = "C:\\Users\\Hi\\Desktop\\resume.docx";
	StringSelection select = new StringSelection(path);
	Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
	clip.setContents(select, select);
	clip.setContents(select, select);
	Thread.sleep(3000);
	
	Robot robo = new Robot();
	robo.keyPress(KeyEvent.VK_CONTROL);
	robo.keyPress(KeyEvent.VK_V);
	robo.delay(3000);
	
	robo.keyRelease(KeyEvent.VK_CONTROL);
	robo.keyRelease(KeyEvent.VK_V);
	
	robo.delay(3000);
	
	robo.keyPress(KeyEvent.VK_ENTER);
	robo.keyRelease(KeyEvent.VK_ENTER);
	TakesScreenshot tss = (TakesScreenshot)driver;
	File src = tss.getScreenshotAs(OutputType.FILE);
	File dst = new File("E:\\for_automation\\Practie1\\Screenshot.png");
	Files.copy(src, dst);
}
}
