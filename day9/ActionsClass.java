package day9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		//if the element is not visible the webDriver cannnot perform the Action class
		//so we need to move to parent menu so that dropdown submenu is visible and webdriver can find the submenu items 
		//perform rightclick using contextclick
		//we can use send keys to send the text 
		//key emmunator provides all the keys of the keyboard and can be used to send keys like tap/ctrl/shift/alt/....
		//to perform combination of key we need to use build methods 
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.krninformatix.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement coursers = driver.findElement(By.xpath("//a[text()='Courses Offered']"));
		Actions action = new Actions(driver);
		action.moveToElement(coursers).perform();
		Thread.sleep(3000);
		action.keyDown(Keys.CONTROL)
		.click(coursers)
		.keyUp(Keys.CONTROL)
		.perform();
		
		driver.manage().deleteAllCookies();
		
		
		action.keyDown(Keys.CONTROL).click(coursers).keyUp(Keys.CONTROL).perform();
//		action.sendKeys(Keys.ARROW_DOWN).perform();
//		Thread.sleep(2000);
//		action.sendKeys(Keys.ENTER).perform();
		
		
		
	}

}
