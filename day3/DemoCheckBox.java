package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.krninformatix.com/sample");
		Boolean onPageLoadStatus = driver.findElement(By.id("rep")).isSelected();
		System.out.println(onPageLoadStatus);
		Thread.sleep(3000);
		driver.findElement(By.id("rep")).click();
		Boolean onClickStatus = driver.findElement(By.id("rep")).isSelected();
		System.out.println(onClickStatus);
		Thread.sleep(3000);
		driver.findElement(By.id("rep")).click();
		Boolean onClickStatus1 = driver.findElement(By.id("rep")).isSelected();
		System.out.println(onClickStatus1);
		Thread.sleep(3000);

		
		Keys.chord(Keys.CONTROL,Keys.ENTER);
	}

}
