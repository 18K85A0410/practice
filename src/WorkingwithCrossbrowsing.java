import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import net.bytebuddy.implementation.bytecode.Division;

public class WorkingwithCrossbrowsing {
public static WebDriver driver;

	public static void main(String[] args) throws IOException {
    File f = new File("E:\\for_automation\\Practie1\\Configuration\\data.properties");
    FileInputStream fis = new FileInputStream(f);
    Properties prop = new Properties();
    prop.load(fis);
    String browser = prop.getProperty("browser");
    System.out.println(browser);
    
    if(browser.equalsIgnoreCase("chrome")){
    driver = new ChromeDriver();
    
    }
     else if(browser.equalsIgnoreCase("Edge")) {
     	 driver = new EdgeDriver();
     }
     else {
    	 System.out.println("wrongbrowser");
     }
    driver.get(prop.getProperty("url"));
     WebElement ele =  driver.findElement(By.xpath(prop.getProperty("searchXpath")));
	//driver.findElement(By.xpath("//input[@class='textField pwdfield']")).sendKeys(prop.getProperty("password"));
     ele.sendKeys(prop.getProperty("searchtext"));
  //  driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click()z;
	}
}


 