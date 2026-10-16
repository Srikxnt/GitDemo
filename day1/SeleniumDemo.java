package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class SeleniumDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		WebDriver driver = new ChromeDriver();
//		WebDriver driver1 = new EdgeDriver();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		driver.get("https://mvnrepository.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
//		Assert.assertEquals()
		
		
		String mainWindowId=driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().window(mainWindowId);
		

		
	}

}
