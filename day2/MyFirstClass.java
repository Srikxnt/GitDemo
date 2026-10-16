package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class MyFirstClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//open google maximize the window and get title and close;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		String title =  driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		driver.close();

	
		
	}

}
