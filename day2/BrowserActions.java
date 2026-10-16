package day2;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class BrowserActions {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
//		WebDriver driverFirefox= new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.manage().window().setSize(new Dimension(400, 800));
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.google.com/");
		String actual=driver.getTitle();
		Assert.assertEquals(actual, "Google");
		Thread.sleep(3000);
		driver.navigate().to("https://www.selenium.dev/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		String mainWindowId= driver.getWindowHandle();
		System.out.println(mainWindowId);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.switchTo().window(mainWindowId);
		Thread.sleep(3000);
		
		String currentURL= driver.getCurrentUrl();
		System.out.println(currentURL);
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(3000);
		driver.quit();
	
		
		

	}
	

}
