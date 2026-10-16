package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://demoqa.com/elements");
		Thread.sleep(3000);

		driver.findElement(By.className("router-link")).click();

		// Full Name Input
		driver.findElement(By.id("userName")).sendKeys("Shrikant");
		Thread.sleep(3000);
		driver.findElement(By.id("userName")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("userName")).sendKeys("Srikant Sangolagi");
		Thread.sleep(3000);

		// Email id input
		driver.findElement(By.id("userEmail")).sendKeys("test123@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("userEmail")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("userEmail")).sendKeys("abc@gmail.com");
		Thread.sleep(3000);

		// current Address input
		driver.findElement(By.id("currentAddress")).sendKeys("Flat No 2010 Panaji Goa India");
		Thread.sleep(2000);
		driver.findElement(By.id("currentAddress")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("currentAddress")).sendKeys("Flat No 202 Panjim , Goa ,India");
		Thread.sleep(3000);

		// permanent Address input
		driver.findElement(By.id("permanentAddress")).sendKeys("Flat No 202 Panjim , Goa ,India");
		Thread.sleep(3000);

		driver.findElement(By.id("item-1")).click();
		Thread.sleep(3000);
//		driver.findElement(By.className("rc-tree-iconEle rc-tree-icon__open")).click();

//	// Chrome Driver 
//	WebDriver chromeDriver = new ChromeDriver();
//	
//	// Edge Driver
//	WebDriver EdgeDriver = new EdgeDriver();
//	
//	// Firefox driver 
//	WebDriver fireFoxDriver = new FirefoxDriver(); 

		driver.get("https://demoqa.com/checkbox");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[@class='rc-tree-switcher rc-tree-switcher_close']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@aria-label='Select Home']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='rc-tree-switcher rc-tree-switcher_close'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@aria-label='Select Downloads']")).click();

	}

}
