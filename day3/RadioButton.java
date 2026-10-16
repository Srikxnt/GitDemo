package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.krninformatix.com/sample");
		Boolean onPageLoad = driver.findElement(By.id("female")).isSelected();
		System.out.println(onPageLoad);
		Thread.sleep(3000);
		driver.findElement(By.id("female")).click();
		Boolean onClick = driver.findElement(By.id("female")).isSelected();
		System.out.println(onClick);
		Thread.sleep(3000);
		driver.findElement(By.id("female")).click();
		boolean OnClick1 = driver.findElement(By.id("female")).isSelected();
		System.out.println(OnClick1);
		Thread.sleep(3000);

	}

}
